package io.github.biezhi.java11.singlefile;

/**
 * 你可以在当前源码的目录下执行
 * <p>
 * java HelloWorld.java 运行这个文件的 main 方法
 *
 * 该命令相当于
 *
 * javac -d <memory> HelloWorld.java
 * java -cp <memory> HelloWorld
 *
 * 该特性来自 <a href="http://openjdk.java.net/jeps/330">JEP330</a>
 * @author biezhi
 * @date 2018/8/1
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello Guys, this is Java 11.");
    }

}
