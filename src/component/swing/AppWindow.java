package component.swing;

import component.AppOverHandler;
import component.DataPrinter;
import component.UserInputReader;

import javax.swing.*;

public class AppWindow extends JFrame implements DataPrinter, UserInputReader, AppOverHandler {

    public AppWindow(){
        super("Dolivka");

        displayInTheMiddleOfTheScreen();
    }

    @Override
    public void appOver()  {
        System.exit(0);
    }

    @Override
    public void printInfoMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void printErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public double digit() {
        return 0;
    }

    @Override
    public String str() {
        return "";
    }

    @Override
    public int zakaz() {
        return 0;
    }
}

