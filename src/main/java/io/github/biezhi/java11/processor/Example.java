package io.github.biezhi.java11.processor;

/**
 * Java SE 9 迎来一些 Process API 的改进，通过添加一些新的类和方法来优化系统级进程的管控。
 * <p>
 * 实际上 JDK 偷偷的在 Java11 又把 API 改了一点。。。不过下面的代码是可以运行的
 *
 * <p>
 * Process API 中的两个新接口：
 * <p>
 * - java.lang.ProcessHandle
 * - java.lang.ProcessHandle.Info
 *
 * @author biezhi
 * @date 2018/7/10
 */
public class Example {

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("当前进程的 PID = " + currentProcess.pid());
    }

}
