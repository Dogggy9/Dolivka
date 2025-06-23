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
import model.zakazy.*;

import static model.config.UserInterface.GUI;
import static model.config.ZakazX.ZAKAZ431;
import static model.config.ZakazX.ZAKAZ832;

public class Factory {

    private ZakazX zakazX;

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
        final Zak zak;
        assert dataPrinter != null;
        dataPrinter.printInfoMessage("zakaz? например zakaz832 по умолчанию 431");
        String zakaz = userInputReader.str();
        System.out.println(zakaz);
        if (ZAKAZ431.name().equalsIgnoreCase(zakaz) || ZAKAZ832.name().equalsIgnoreCase(zakaz)){
                zakazX = ZakazX.valueOf(zakaz.toUpperCase());
        }
        if (zakazX == ZAKAZ431) {
            zak = new Zak431();
        } else if (zakazX == ZAKAZ832) {
            zak = new Zak832();
    } else {
            zak = new Zak431();
        }


        return new Dolivka(dataPrinter,
                userInputReader,
                zak,
                appOverHandler);
    }
}
