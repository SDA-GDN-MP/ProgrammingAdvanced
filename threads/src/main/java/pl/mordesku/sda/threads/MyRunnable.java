package pl.mordesku.sda.threads;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-22
 * Time: 20:22
 */
public class MyRunnable implements  Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
