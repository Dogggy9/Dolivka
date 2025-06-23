package component;

import model.config.ZakazX;
import model.zakazy.Zakaz;

public class Dolivka {
    private final DataPrinter dataPrinter;
    private final UserInputReader userInputReader;
    private final Zakaz zakaz;

    public Dolivka(DataPrinter dataPrinter, UserInputReader userInputReader, Zakaz zakaz) {
        this.dataPrinter = dataPrinter;
        this.userInputReader = userInputReader;
        this.zakaz = zakaz;
    }

    public void start(){

        dataPrinter.printInfoMessage("Сколько сейчас уровень? ");
        double levelNow = userInputReader.digit();
        dataPrinter.printInfoMessage("Сколько сейчас температура? ");
        double temperaturNow = userInputReader.digit();
    }
}
