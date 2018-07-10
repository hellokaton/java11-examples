package io.github.biezhi.java11.collections;

/**
 * Java7 引入了一个新的特性：Diamond Operator，来避免冗长代码和提升可读性。
 * <p>
 * 然而在 Java 8 中，Oracle 发现在 Diamond 操作器和匿名内部类的使用中存在一些局限性，
 * 后来修复了这些问题并准备将其作为 Java9 的一部分发布出去。
 *
 * @author biezhi
 * @date 2018/7/10
 */
public class DiamondOperatorExample {

    static abstract class MyHandler<T> {

        private T content;

        public MyHandler(T content) {
            this.content = content;
            System.out.println("构造函数收到了一条内容: " + content.toString());
        }

        public T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }

        abstract void handle();
    }

    public static void main(String[] args) {
        MyHandler<Integer> intHandler = new MyHandler<>(1) {
            @Override
            public void handle() {
                System.out.println("收到红包 > " + getContent() + "元");
            }
        };
        intHandler.handle();

        System.out.println("===================神奇的分割线===================");

        MyHandler<? extends Integer> intHandler1 = new MyHandler<>(10) {
            @Override
            void handle() {
                System.out.println("收到红包 > " + getContent() + "元");
            }
        };
        intHandler1.handle();

        System.out.println("===================神奇的分割线===================");

        MyHandler<?> handler = new MyHandler<>("魔法师") {
            @Override
            void handle() {
                System.out.println("马上把 [" + getContent() + "] 给处理了");
            }
        };
        handler.handle();

    }

}
