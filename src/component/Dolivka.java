package component;

import model.zakazy.Zak;

public class Dolivka {
    private final DataPrinter dataPrinter;
    private final UserInputReader userInputReader;
    private final Zak zak;
    private final AppOverHandler appOverHandler;

    public Dolivka(DataPrinter dataPrinter, UserInputReader userInputReader, Zak zak, AppOverHandler appOverHandler) {
        this.dataPrinter = dataPrinter;
        this.userInputReader = userInputReader;
        this.zak = zak;
        this.appOverHandler = appOverHandler;
    }

    public void start(){

        while (true) {
            dataPrinter.printInfoMessage("Сколько сейчас уровень? ");
            zak.setLevelNow(userInputReader.digit());
            dataPrinter.printInfoMessage("Сколько сейчас температура? ");
            zak.setTemperatureNow(userInputReader.digit());

            dataPrinter.printInfoMessage("доливаемся до уровня " + zak.getLevelNado());
            dataPrinter.printInfoMessage("Надо литров " + zak.getLitrsNado());


            dataPrinter.printInfoMessage("Исчо? ");
            String otvet = userInputReader.str();
            if (otvet.equalsIgnoreCase("нет") || otvet.equalsIgnoreCase("no") ){
                appOverHandler.appOver();
                return;
            }

        }
    }
}
