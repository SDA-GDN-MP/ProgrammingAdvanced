package pl.mordesku.sda.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-20
 * Time: 19:35
 */
public class TextViewerFrame extends JFrame {

    public static final String WINDOW_TILE = "Text Viewer";

    private JTextArea fileContent = new JTextArea();

    private JTextField fileNameTextField = new JTextField();

    private JNotePadMenuBar menuBar = new JNotePadMenuBar();

    public TextViewerFrame() {
        super(WINDOW_TILE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(300, 300);
        addComponents();
        addListeners();
    }

    private void addListeners() {
        menuBar.addLoadFileActionListener(new LoadFileContentActionListener(fileNameTextField, fileContent));
        menuBar.addSaveFileActionListener(new SaveFileActionListener(fileNameTextField, fileContent));
        menuBar.addSaveAsFileActionListener(new SaveAsFileActionListener(fileContent));
    }

    private void addComponents() {
        add(menuBar, BorderLayout.PAGE_START);
        add(fileContent, BorderLayout.CENTER);
        add(fileNameTextField, BorderLayout.PAGE_END);
    }
}
