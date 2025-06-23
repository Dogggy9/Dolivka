import component.AppOverHandler;
import component.DataPrinter;
import component.Dolivka;
import component.UserInputReader;
import component.config.CommandLineArgumentParser;
import component.console.ConsoleAppOverHandler;
import component.console.ConsoleDataPrinter;
import component.console.ConsoleUserInputReader;
import model.config.UserInterface;
import model.config.ZakazX;
import model.zakazy.Zakaz;
import model.zakazy.Zakaz431;
import model.zakazy.Zakaz832;

import static model.config.UserInterface.GUI;
import static model.config.ZakazX.ZAKAZ431;
import static model.config.ZakazX.ZAKAZ832;

public class Factory {

    private final ZakazX zakazX;

    private final UserInterface userInterface;

    public Factory(final String[] args) {
        final CommandLineArgumentParser.CommandLineArguments commandLineArguments =
                new CommandLineArgumentParser(args).parse();
        zakazX = commandLineArguments.getZakazX();
        userInterface = commandLineArguments.getUserInterface();
    }

    public Dolivka create() {
        final DataPrinter dataPrinter;
        final UserInputReader userInputReader;
        final AppOverHandler appOverHandler;
        if (userInterface == GUI) {
//            final AppWindow appWindow = new AppWindow();
            dataPrinter = null; // appWindow
            userInputReader = null; // appWindow
            appOverHandler = null; // appWindow;
        }else {
            dataPrinter = new ConsoleDataPrinter();
            userInputReader = new ConsoleUserInputReader();
            appOverHandler = new ConsoleAppOverHandler(dataPrinter);
        }
        final Zakaz zakaz;
        if (zakazX == ZAKAZ431) {
            zakaz = new Zakaz431();
        } else if (zakazX == ZAKAZ832) {
            zakaz = new Zakaz832();
    } else {
            zakaz = new Zakaz431();
        }


        return new Dolivka(dataPrinter,
                userInputReader,
                zakaz,
                appOverHandler);
    }
}
