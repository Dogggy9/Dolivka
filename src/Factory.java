import component.DataPrinter;
import component.Dolivka;
import component.UserInputReader;
import component.console.ConsoleDataPrinter;
import component.console.ConsoleUserInputReader;
import component.zakazy.Zakaz431;
import component.zakazy.Zakaz832;
import model.config.UserInterface;

public class Factory {

    private final Zakaz431 zakaz431;

    private final Zakaz832 zakaz832;

    private final UserInterface userInterface;

    public Factory(Zakaz431 zakaz431, Zakaz832 zakaz832, UserInterface userInterface) {
        this.zakaz431 = zakaz431;
        this.zakaz832 = zakaz832;
        this.userInterface = userInterface;
    }

    public Dolivka create() {
        final DataPrinter dataPrinter;
        final UserInputReader userInputReader;

        dataPrinter = new ConsoleDataPrinter();
        userInputReader = new ConsoleUserInputReader();
        return null;
    }
}
