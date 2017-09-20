package pl.mordesku.sda.swing;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-20
 * Time: 20:26
 */
public class SaveAsFileActionListener implements ActionListener {
    JTextArea textArea;

    public SaveAsFileActionListener(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Text files", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showSaveDialog(textArea.getParent());
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            String fileName = chooser.getSelectedFile().getAbsolutePath();
            System.out.println("You chose to save this file: " +
                    fileName);
            try {
                PrintWriter printWriter = new PrintWriter(fileName);
                printWriter.write(textArea.getText());
                printWriter.close();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        }
    }
}
