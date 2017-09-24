package pl.mordesku.sda.threads;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-22
 * Time: 20:43
 */
public class ThreadPlaygroundRunnable implements Runnable{
    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    Thread.currentThread().getName()
                            + " "
                            + name
                            + i);
        }
    }
}
