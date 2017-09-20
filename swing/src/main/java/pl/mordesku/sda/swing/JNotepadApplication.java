package pl.mordesku.sda.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-20
 * Time: 19:03
 */
public class JNotepadApplication {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        JFrame jFrame = new JFrame("Test");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(800,600);
        jFrame.setLayout(new BorderLayout());
        JMenuBar component = new JMenuBar();
        component.add(new JMenu("File"));
        JMenu edit = new JMenu("Edit");
        edit.add(new JMenuItem("Copy"));
        edit.add(new JMenuItem("Cut"));
        edit.add(new JMenuItem("Paste"));
        edit.addActionListener(actionEvent -> {
            System.out.println("Menu clicked " + actionEvent.getSource());
        });
        component.add(edit);
        component.add(new JMenu("Help"));
        jFrame.add(component, BorderLayout.PAGE_START);
        JList<String> component1 = new JList<>(new String[] {"raz", "dwa", "trzy"});
        jFrame.add(component1, BorderLayout.CENTER);
        jFrame.add(new JTextField("test"), BorderLayout.PAGE_END);
        jFrame.setVisible(true);

    }
}
