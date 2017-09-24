package pl.mordesku.sda.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import javax.swing.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-21
 * Time: 15:40
 */

public class WindowPlaygroundTest {
    WindowPlayground playground = new WindowPlayground();
    @Test
    public void shouldSetWindowVisibility()
    {
        //given
        JFrame jFrame = Mockito.mock(JFrame.class);
        //when
        playground.showWindow(jFrame);
        //then
        Mockito.verify(jFrame).setVisible(true);
        Mockito.verify(jFrame, Mockito.never()).setVisible(false);
    }

    @Test
    public void shouldAssertThat()
    {
        //given
        String test = "janausz123456";
        //when

        //then
        assertThat(test, containsString("mateusz"));
    }
}
