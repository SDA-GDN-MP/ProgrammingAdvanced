package pl.mordesku.sda.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-20
 * Time: 20:33
 */
public class SaveFileActionListener implements ActionListener {
    private final JTextField fileNameTextField;
    private final JTextArea fileContent;

    public SaveFileActionListener(JTextField fileNameTextField, JTextArea fileContent) {

        this.fileNameTextField = fileNameTextField;
        this.fileContent = fileContent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try (PrintWriter writer = new PrintWriter(fileNameTextField.getText())) {
            writer.write(fileContent.getText());
            writer.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
