package inter_as_params;

/*
    函数式接口作为方法的参数：
        如果方法的参数是一个函数式接口，可以使用lambda表达式作为参数传递
        需求：
            定义一个类RunnableDemo，在类中提供两个方法：
                一个方法是startThread(Runnable r) 方法参数Runnable是一个函数式接口
                一个方法是主方法，在主方法中调用startThread方法
 */

public class RunnableDemo {
    public static void main(String[] args) {
        // 匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        });

        // lambda表达式
        startThread( () -> System.out.println(Thread.currentThread().getName() + "线程启动了"));
    }

    private static void startThread(Runnable r){
//        Thread t = new Thread(r);
//        t.start();
        new Thread(r).start();

    }
}
