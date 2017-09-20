package pl.mordesku.sda.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-20
 * Time: 19:52
 */
public class LoadFileContentActionListener implements ActionListener {
    private final JTextField fileNameTextField;
    private final JTextArea fileContent;

    public LoadFileContentActionListener(JTextField fileNameTextField, JTextArea fileContent) {
        this.fileNameTextField = fileNameTextField;
        this.fileContent = fileContent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            fileContent.setText(
                    new String(Files.readAllBytes(Paths.get(fileNameTextField.getText()))));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
