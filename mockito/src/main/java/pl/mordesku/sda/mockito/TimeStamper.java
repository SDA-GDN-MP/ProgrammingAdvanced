package pl.mordesku.sda.mockito;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-21
 * Time: 20:01
 */
public class TimeStamper {
    public Double timestamp() {
        return Math.random();
    }

    public String timestampedString(String input) {
        return input+timestamp();
    }
}
