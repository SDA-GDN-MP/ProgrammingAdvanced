package pl.mordesku.sda.mockito;

import org.junit.Test;

import javax.swing.*;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.verify;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-21
 * Time: 15:40
 */

public class WindowPlaygroundTest {
    WindowPlayground playground = new WindowPlayground();
    @Test
    public void shouldSetWindowVisibilty()
    {
        //given
        JFrame jFrame = new JFrame();
        //when
        playground.showWindow(jFrame);
        //then
        assertEquals(true, jFrame.isVisible());
        verify(jFrame).setVisible(true);
    }
}
