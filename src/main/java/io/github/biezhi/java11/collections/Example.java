package io.github.biezhi.java11.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;


/**
 * 这个例子中感受一些新版本改(chao)进(xi)的集合 API。
 *
 * @author biezhi
 * @date 2018/7/10
 */
public class Example {

    public static void main(String[] args) {

        // 空列表，数据类型为 Object
        List immutableList = List.of();

        // 创建 List<String>
        var foo = List.of("biezhi", "github", "王爵的技术小黑屋");

        // 空 Map，Key 和 Value 类型都是 Object
        Map emptyImmutableMap = Map.of();

        // 快速创建一个 Map
        var mmp = Map.of(2017, "先赚他一个亿", 2018, "去年的梦想可能有点儿夸张");

        // 使用 Entries 创建一个 Map
        Map<Integer, String> emptyEntryMap = Map.ofEntries(
                entry(20, "装逼"),
                entry(30, "单身"),
                entry(40, "回家种地")
        );

        // 创建一个 Map.Entry
        Map.Entry<String, String> immutableMapEntry = Map.entry("biezhi", "emmmm");
        // 其实和上面的代码片段是一样一样的
        Map.ofEntries(immutableMapEntry);

        // 创建一个空 Set<String>
        Set<String> immutableSet = Set.of();

        // 快速创建一个 Set<String>
        Set<String> bar = Set.of("我", "可能", "是个", "假的", "程序员");

    }

}
