package com.specialflow.properties;

/*
    案例：游戏次数
    需求：
        请写程序实现猜数字小游戏只能试玩3次，如果还想玩，提示：游戏试玩结束，想玩请充值

 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        // 从文件中读取数据到Properties集合，用load()方法实现
        Properties prop = new Properties();

        FileReader fr = new FileReader("IO\\src\\com\\specialflow\\properties\\game.txt");
        prop.load(fr);
        fr.close();

        // 通过Properties集合获取到玩游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        // 判断次数是否到了3次
        if (number >= 3){
            System.out.println("游戏试玩已经结束，请充值");
        }else {
            // 玩游戏
            GuessNumber.start();

            // 次数+1,重新写回文件，用Properties的store()方法实现
            number++;
            prop.setProperty("count", String.valueOf(number));
            FileWriter fw = new FileWriter("IO\\src\\com\\specialflow\\properties\\game.txt");
            prop.store(fw, null);
            fw.close();
        }
    }
}
