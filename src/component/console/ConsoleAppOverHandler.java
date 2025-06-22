package component.console;

import component.AppOverHandler;
import component.DataPrinter;

public class ConsoleAppOverHandler implements AppOverHandler {

    private final DataPrinter dataPrinter;

    public ConsoleAppOverHandler(DataPrinter dataPrinter) {
        this.dataPrinter = dataPrinter;
    }

    @Override
    public void appOver() {
        dataPrinter.printInfoMessage("Конец");
    }
}
