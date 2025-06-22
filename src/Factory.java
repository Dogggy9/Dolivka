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

import static model.config.UserInterface.GUI;

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
//            final GameWindow gameWindow = new GameWindow();
            dataPrinter = null;
//            userInputReader = gameWindow;
//            appOverHandler = gameWindow;
        }else {
            dataPrinter = new ConsoleDataPrinter();
            userInputReader = new ConsoleUserInputReader();
            appOverHandler = new ConsoleAppOverHandler(dataPrinter);
        }


        return new Dolivka(dataPrinter, zakazX);
    }
}
