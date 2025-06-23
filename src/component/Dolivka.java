package component;

import model.zakazy.Zakaz;

public class Dolivka {
    private final DataPrinter dataPrinter;
    private final UserInputReader userInputReader;
    private final Zakaz zakaz;
    private final AppOverHandler appOverHandler;

    public Dolivka(DataPrinter dataPrinter, UserInputReader userInputReader, Zakaz zakaz, AppOverHandler appOverHandler) {
        this.dataPrinter = dataPrinter;
        this.userInputReader = userInputReader;
        this.zakaz = zakaz;
        this.appOverHandler = appOverHandler;
    }

    public void start(){

        while (true) {
            dataPrinter.printInfoMessage("Сколько сейчас уровень? ");
            zakaz.setLevelNow(userInputReader.digit());
            dataPrinter.printInfoMessage("Сколько сейчас температура? ");
            zakaz.setTemperatureNow(userInputReader.digit());

            dataPrinter.printInfoMessage("доливаемся до уровня " + zakaz.getLevelNado());
            dataPrinter.printInfoMessage("Надо литров " + zakaz.getLitrsNado());


            dataPrinter.printInfoMessage("Исчо? ");
            String otvet = userInputReader.str();
            if (otvet.equalsIgnoreCase("нет") || otvet.equalsIgnoreCase("no") ){
                appOverHandler.appOver();
                return;
            }

        }
    }
}
