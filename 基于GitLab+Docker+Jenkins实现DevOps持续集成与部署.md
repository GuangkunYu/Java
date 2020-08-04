# 基于GitLab+Docker+Jenkins实现DevOps持续集成与部署

## 1. 安装启动docker

### 1.1 安装docker

```shell
# 1、yum 包更新到最新
yum update
# 2、安装需要的软件包，yum-util提供yum-config-manager功能，另外两个是devicemapper驱动依赖的
yum install -y yum-utils device-mapper-persistent-data lvm2
# 3、设置yum源
yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
# 4、安装docker，出现输入的界面都按y
yum install -y docker-ce
# 5、查看docker版本，验证是否验证成功
docker -v
```

 

### 1.2 配置镜像加速器

```shell
sudo mkdir -p /etc/docker
sudo tee /etc/docker/daemon.json <<-'EOF'
{
  "registry-mirrors": ["https://3ut69tt1.mirror.aliyuncs.com"]
}
EOF
sudo systemctl daemon-reload
sudo systemctl restart docker
```

 

### 1.3 安装私有库

```shell
# 搜索镜像
docker search registry
# 拉取镜像
docker pull registry
# 创建容器
docker run -d -p 5000:5000 registry
# 配置私有仓库地址
vim /etc/docker/daemon.json
{
	"insecure-registries":["192.168.200.133:5000"]
}

sudo systemctl daemon-reload
sudo systemctl restart docker

# 启动本地仓库容器
docker start 容器ID

```



### 1.4 访问私有仓库

[http://192.168.200.133:5000/v2/__catalog](http://192.168.200.133:5000/v2/__catalog)

如果访问不到，关闭防火墙

```shell
systemctl stop firewalld
```





## 2. docker下gitlab安装配置使用

### 2.1 安装

```shell
# 查找gitlab镜像
docker search gitlab

# gitlab镜像拉取
docker pull gitlab/gitlab-ce

# 查看本地镜像
docker images

# 本机建立的3个目录
# 为了gitlib容器通过挂载本机目录启动后可以映射到本机，然后后续就可以直接在本机查看和编辑了，不用在进容器操作
# 配置文件
mkdir -p /home/gitlab/etc
# 数据文件
mkdir -p /home/gitlab/data
# 日志文件
mkdir -p /home/gitlab/logs

# 启动容器
docker run --name='gitlab' -d \
--publish 4443:443 --publish 8888:80 \
-v /home/gitlab/etc:/etc/gitlab \
-v /home/gitlab/data:/var/opt/gitlab \
-v /home/gitlab/logs:/var/log/gitlab \
gitlab/gitlab-ce:latest

# 查看启动日志
docker logs -f gitlab
```



### 2.2 配置

> 按照上面的方式，gitlab容器运行没问题，但在gitlab上创建项目的时候，生成项目的url访问地址是按容器的hostname来生成的，也就是容器的id。作为gitlab服务器，我们需要一个固定的url访问地址，于是需要配置gitlab.rb（宿主机路径：/home/gitlab/config/fitlab.rb）

```shell
# 配置域名或IP

# 配置gitlab.rb
cd /home/gitlab/etc
vim gitlab.rb

# 配置http协议所使用的访问地址，不加端口号默认为80
external_url 'http://192.168.200.133'
# 配置gitlab.yml
cd /home/gitlab/data/gitlab-rails/etc
vim gitlab.yml

gitlab:
	## web server settings(note:host is the FQON,do not include http://)
	host:192.168.200.133
	port:8888
	https:false
	
```



### 2.3 初始化密码

gitlab默认管理用户是root

登陆：[http://192.168.200.133:8888](http://192.168.200.133:8888) 登陆修改root的密码



### 2.4 登陆

用户名root 密码



### 2.5 创建项目

http-demo







## 3. 安装Git

```shell
# 安装
yum install -y git

# 查看版本
git version

```







## 4.使用Git管理项目

### 4.1 使用idea从GitLab检出空项目

项目地址：[http://192.168.200.133:8888/root/http-demo.git](http://192.168.200.133:8888/root/http-demo.git)



### 4.2 复制项目并运行

idea中运行项目并访问：[http://127.0.0.1:10000/user/1](http://127.0.0.1:10000/user/1)



### 4.3 提交代码到GitLab

在工程根目录创建.gitignore，此文件中记录了在提交代码时哪些文件或目录被忽略

```shell
.idea/
target/
*.iml
```







## 5.springboot工作制作镜像

### 5.1 SpringBoot运行Jar包

- 使用maven的打包插件

> 将下边的插件依赖拷贝到微服务工程中

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

- 使用maven打包并运行访问微服务工程

```java
java -jar http-demo-1.0-SNAPSHOT.jar
```



### 5.2 创建Docker镜像

在linux上新建一个目录，将上一步的jar包拷贝到Linux服务器，准备创建镜像

```shell
cd /home
mkdir icoding
```

测试jar包是否可以运行，执行：java -jar

```shell
java -jar http-demo-1.0-SNAPSHOT.jar
```

访问：[http://192.168.200.133:10000/user/1](http://192.168.200.133:10000/user/1)

在http-demo-1.0-SNAPSHOT.jar所在文件夹位置编写Dockerfile文件

```shell
vim Dockerfile

FROM java:8
# VOLUME指定了零时文件目录为/tmp
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为app.jar
ADD http-demo-1.0-SNAPSHOT.jar.app.jar
# 运行jar包
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
```

在Dockerfile文件所在目录创建镜像

```shell
docker build -t http-demo:1.0-SNAPSHOT
```

查看镜像

```shell
docker images
```



### 5.3 创建启动容器

基于http-demo:1.0-SNAPSHOT镜像创建容器，容器名称为http-demo

```SHELL
docker run -d -p 10000:10000 http-demo:1.0-SNAPSHOT
```

容器创建成功，可以通过docker ps -a命令查看



### 5.4 访问页面

[http://192.168.200.133:10000/user/1](http://192.168.200.133:10000/user/1)



### 5.5 停止与删除

停止容器 删除容器 删除镜像



### 5.6 使用maven构建镜像

上边构建的过程是通过手工一步一步完成，maven提供docker-maven-plugin插件课完成从打包到镜像建容器等过程



#### 5.6.1 编写pom_docker.xml

```XML
<?xml version="1.0" encoding="UTF-8"?> 
<project xmlns="http://maven.apache.org/POM/4.00"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>sprint-boot-starter-parent</artifactId>
        <version>2.1.5.RELEASE</version>
    </parent>
    
    <groupId>com.icoding</groupId>
    <artifactId>http-demo</artifactId>
    <version>1.0-SNAPSHOT</version>
    
    <properties>
    	<java.version>1.8</java.version>
    </properties>
    
    <dependencies>
    	<dependency>
        	<groupId>org.springframework.boot</groupId>
        	<artifactId>sprint-boot-starter</artifactId>
        </dependency>
        <dependency>
        	<groupId>org.springframework.boot</groupId>
        	<artifactId>sprint-boot-starter-web</artifactId>
        </dependency>
        <dependency>
        	<groupId>org.springframework.boot</groupId>
        	<artifactId>sprint-boot-starter-test</artifactId>
        </dependency>
        <dependency>
        	<groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
    </dependencies>
    
    <build>
    	<plugins>
        	<plugin>
            	<groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
            
            <plugin>
            	<groupId>com.spotify</groupId>
                <artifactId>docker-maven-plugin</artifactId>
                <version>1.0.0</version>
                <!--docker镜像相关配置信息-->
                <configuration>
                	<!--镜像名，这里用工程名-->
                    <imageName>${project.artifactId}</imageName>
                    <!-- Dockerfile文件所在目录-->
                    <dockerDirectoty>${project.basedir}/src/main/resources</dockerDirectoty>
                    <!-- TAG.这里用工程版本号 -->
                    <imageTags>
                    	<imageTag>${project.version}</imageTag>
                    </imageTags>
                    <!-- 构建镜像的配置信息 -->
                    <resources>
                    	<resource>
                        	<targetPath>/</targetPath>
                            <directory>${project.build.directory}</directory>
                            <include>${project.artifactId}-${project.version}.jar</include>
                        </resource>
                    </resources>
                </configuration>
            </plugin>
        </plugins>
    </build>
<project>
```



#### 5.6.2 拷贝Dockerfile文件



#### 5.6.3 在IDEA中提交修改的文件



#### 5.6.4 lclone最新项目

```sehll
git clone http://192.168.200.133:8888/root/http-demo.git
```



#### 5.6.5 打包构建镜像

```shell
# 进入工程目录
cd http-demo

# 打包构建镜像
mvn -f pom_docker.xml clean package -DskipTests docker:build
```



#### 5.6.6 创建自动容器

基于http-demo:1.0-SNAPSHOT镜像创建容器，容器名称为http-demo

```shell
docker run -d -p 10000:10000 http-demo:1.0-SNAPSHOT
```

容器创建成功，可通过docker ps -a命令查看



#### 5.6.7 访问页面

[http://192.168.200.133:10000/user/1](http://192.168.200.133:10000/user/1)



## 6.继续继承介绍



## 7. Jenkins安装配置使用

### 7.1 安装

```shell
# 搜索镜像
docker search jenkins

# 拉取镜像
docker pull jenkins/jenkins:lts

# 创建容器
docker run --name=jenkins\
	-u root \
	--rm \
	-d \
	-p 8080:8080 \
	-p 50000:50000 \
	-v /var/run/docker.sock:/var/run/docker.sock \
	-v /usr/bin/docker:/usr/bin/docker \
	-v /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.242.b08-0.el7_7.x86_64:/usr/java/jdk1.8.0_181 \
	-v /usr/local/maven3:/usr/local/maven \
	-v /usr/local/maven_repository:/usr/local/maven_repository \
	-v /home/jenkins-data:/var/jenkins_home \ 
	jenkins/jenkins:lts
	
	
```



### 7.2 解锁Jenkins

[http://192.168.200.133:8080](http://192.168.200.133:8080) 首次登陆需要，解锁Jenkins

进入容器内部docker exec -it jenkins bash

执行：cat/var/jenkins_home/secrets/initialAdminPassword,得到密码并粘贴过去



### 7.3 登陆





## 8. 持续集成

### 8.1 编写pom.xml文件

使用jinkins进行构建，在http-demo工程根目录编写pom_docker_registry.xml

```xml
<?xml version="1.0" encoding="UTF-8">
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>sprint-boot-starter-parent</artifactId>
        <version>2.1.5.RELEASE</version>
    </parent>
    
    <groupId>com.icoding</groupId>
    <artifactId>http-demo</artifactId>
    <version>1.0-SNAPSHOT</version>
    
    <properties>
    	<java.version>1.8</java.version>
    </properties>
    
    <dependencies>
    	<dependency>
        	<groupId>org.springframework.boot</groupId>
        	<artifactId>sprint-boot-starter</artifactId>
        </dependency>
        <dependency>
        	<groupId>org.springframework.boot</groupId>
        	<artifactId>sprint-boot-starter-web</artifactId>
        </dependency>
        <dependency>
        	<groupId>org.springframework.boot</groupId>
        	<artifactId>sprint-boot-starter-test</artifactId>
        </dependency>
        <dependency>
        	<groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
    </dependencies>
    
    <build>
    	<plugins>
        	<plugin>
            	<groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
            
            <plugin>
            	<groupId>com.spotify</groupId>
                <artifactId>docker-maven-plugin</artifactId>
                <version>1.0.0</version>
                <!--docker镜像相关配置信息-->
                <configuration>
                	<!--镜像名，这里用工程名-->
                    <imageName>${project.artifactId}</imageName>
                    <!-- Dockerfile文件所在目录-->
                    <dockerDirectoty>${project.basedir}/src/main/resources</dockerDirectoty>
                    <!-- TAG.这里用工程版本号 -->
                    <imageTags>
                    	<imageTag>${project.version}</imageTag>
                    </imageTags>
                    <!-- 构建镜像的配置信息 -->
                    <resources>
                    	<resource>
                        	<targetPath>/</targetPath>
                            <directory>${project.build.directory}</directory>
                            <include>${project.artifactId}-${project.version}.jar</include>
                        </resource>
                    </resources>
                </configuration>
            </plugin>
        </plugins>
    </build>
<project>
```

提交gitlab仓库



### 8.2 创建持续集成任务

####  8.2.1 创建构建任务

http-demo



#### 8.2.2 配置git仓库

```xml
Repository URL: http://192.168.200.133:8888/root/http-demo.git
```

 

#### 8.2.3 maven构建配置

- 使用shell脚本停止容器、删除容器、删除镜像，shell脚本如下：

```shell
#！/bin/bash
result=$(docker ps | grep "192.168.200.133:5000/http-demo")
if [["$result" != ""]]
then
echo "stop http-demo"
docker stop http-demo
fi
result1=$(docker ps -a | grep "192.168.200.133:5000/http-demo")
if[["$result1" != ""]]
then
echo "rm http-demo"
docker rm http-demo
fi
result2=$(docker images | grep "192.168.200.133:5000/http-demo")
if [["$result2" != ""]]
then
echo "192.168.200.133:5000/http-demohttp-demo:1.0-SNAPSHOT"
docker rmi 192.168.200.133:5000/http-demo:1.0-SNAPSHOT
fi

```

- 执行maven构建

```xml
clean package -f pom_docker_registry.xml -DskipTests docker:build
```

- 拉取镜像，创建容器，启动容器

```xml
docker run --name http-demo -p 10000:10000 -idt 192.168.200.133:5000/http-demo:1.0-SNAPSHOT
```



### 8.4 执行任务

修改代码内容自动构建演示



### 8.5 自动构建

Jenkins中那倒钩子地址：Build Triggers

[http://192.168.200.133:8080/project/http-demo](http://192.168.200.133:8080/project/http-demo)

gitlab中配置钩子地址：

