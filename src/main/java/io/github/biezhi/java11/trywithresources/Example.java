package io.github.biezhi.java11.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Java SE 7 引入了一个新的异常处理结构：Try-With-Resources，来自动管理资源。
 * <p>
 * 这个新的声明结构主要目的是实现“Automatic Better Resource Management”（“自动资源管理”）。
 * <p>
 * Java SE 9 将对这个声明作出一些改进来避免一些冗长写法，同时提高可读性。
 *
 * @author biezhi
 * @date 2018/7/10
 */
public class Example {

    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new FileReader("./README.md"));
        try (reader1) {
            while(reader1.ready()){
                System.out.println(reader1.readLine());
            }
        }
    }

}
