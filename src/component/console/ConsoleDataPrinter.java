package component.console;
import component.DataPrinter;

public class ConsoleDataPrinter implements DataPrinter{
    @Override
    public void printInfoMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void printErrorMessage(String message) {
        System.err.println(message);
    }
}
