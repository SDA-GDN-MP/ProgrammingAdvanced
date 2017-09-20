package pl.mordesku.sda.swing;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-20
 * Time: 17:28
 */
public class WindowApplication {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        System.out.println("Application started");
        JFrame window = new JFrame("SDA swing");
        window.setSize(300,300);
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Załaduj plik");
        window.add(button, BorderLayout.PAGE_START);
        JTextField textField = new JTextField("test");
        window.add(textField, BorderLayout.PAGE_END);
        JTextArea textArea = new JTextArea();
        window.add(textArea, BorderLayout.CENTER);
        window.setVisible(true);

        button.addActionListener(e -> {

            System.out.println(textField.getText());
            try {
                textArea.setText(
                        new String(
                                Files.readAllBytes(
                                        Paths.get(textField.getText()
                                        )
                                )));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}
