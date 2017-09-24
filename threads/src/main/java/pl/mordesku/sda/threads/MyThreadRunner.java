package pl.mordesku.sda.threads;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-22
 * Time: 20:15
 */
public class MyThreadRunner {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
