package io.github.biezhi.java11.var;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * 感受 JEP 286 的魔法世界
 *
 * @author biezhi
 * @date 2018/7/10
 */
public class Example {

    public static void main(String[] args) throws Exception {
        var list   = new ArrayList<String>();   // 自动推断 ArrayList<String>
        var stream = list.stream();             // 自动推断 Stream<String>

        var newList = List.of("hello", "biezhi");
        newList.forEach(System.out::println);

        String fileName = "./pom.xml";

        var path  = Paths.get(fileName);
        var bytes = Files.readAllBytes(path);

        System.out.println("字节数组: " + bytes);

        for (var b : bytes) {
            // TODO
        }

        try (var foo = new FileInputStream(new File(""))) {
            System.out.println(foo);
        } catch (Exception e) {
            // ignore
        }

    }
}
