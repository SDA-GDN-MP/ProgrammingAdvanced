package pl.mordesku.sda.swing;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-20
 * Time: 20:06
 */
public class JNotePadMenuBar extends JMenuBar {
    public static final String FILE_MENU_TITLE = "File";
    public static final String LOAD_MENU_ITEM_TITLE = "Load";
    public static final String SAVE_MENU_ITEM_TITLE = "Save";
    public static final String SAVE_AS_MENU_ITEM_TITLE = "Save As";

    private JMenu fileMenu = new JMenu(FILE_MENU_TITLE);

    private JMenuItem laodFIleMenuItem = new JMenuItem(LOAD_MENU_ITEM_TITLE);

    private JMenuItem saveFileMenuItem = new JMenuItem(SAVE_MENU_ITEM_TITLE);

    private JMenuItem saveAsFileMenuItem = new JMenuItem(SAVE_AS_MENU_ITEM_TITLE);

    public JNotePadMenuBar() {
        addComponents();
    }

    private void addComponents() {
        fileMenu.add(laodFIleMenuItem);
        fileMenu.add(saveFileMenuItem);
        fileMenu.add(saveAsFileMenuItem);
        add(fileMenu);
    }

    public void addLoadFileActionListener(ActionListener listener){
        laodFIleMenuItem.addActionListener(listener);
    }

    public void addSaveFileActionListener(ActionListener listener) {
        saveFileMenuItem.addActionListener(listener);
    }

    public void addSaveAsFileActionListener(ActionListener listener) {
        saveAsFileMenuItem.addActionListener(listener);
    }

}
