package pl.mordesku.sda.threads;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-22
 * Time: 20:12
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
