package pl.mordesku.sda.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-22
 * Time: 20:45
 */
public class ExecutorRunner {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            service.execute(new ThreadPlaygroundRunnable("runnable-"+i));
        }
        service.shutdown();
    }
}
