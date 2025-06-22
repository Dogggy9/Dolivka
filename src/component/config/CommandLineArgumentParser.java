package component.config;

import model.config.UserInterface;
import model.config.ZakazX;

import static model.config.UserInterface.CONSOLE;
import static model.config.UserInterface.GUI;
import static model.config.ZakazX.ZAKAZ431;
import static model.config.ZakazX.ZAKAZ832;

public class CommandLineArgumentParser {

    private final String[] args;

    public CommandLineArgumentParser(String[] args) {
        this.args = args;
    }

    public CommandLineArguments parse(){
        ZakazX zakazX = null;
        UserInterface userInterface= null;
        for (String arg: args){
            if (ZAKAZ431.name().equalsIgnoreCase(arg) || ZAKAZ832.name().equalsIgnoreCase(arg)){
                if (zakazX==null) {
                    zakazX = ZakazX.valueOf(arg.toUpperCase());
                }
            } else {
                System.err.println("Неподдерживаемый аргумент командной строки: '" + arg + "'");
            }

            if (GUI.name().equalsIgnoreCase(arg) || CONSOLE.name().equalsIgnoreCase(arg)) {
                if (userInterface == null) {
                    userInterface = UserInterface.valueOf(arg.toUpperCase());
                } else {
                    System.err.println("Неподдерживаемый аргумент командной строки: '" + arg + "'");
                }

            } else {
                System.err.println("Неподдерживаемый аргумент командной строки: '" + arg + "'");
            }
        }
        if (userInterface == null){
            userInterface = CONSOLE;
        }
        if (zakazX == null){
            return new CommandLineArguments(ZAKAZ431, userInterface);
        } else
            return new CommandLineArguments(zakazX, userInterface);
    }

    public static class CommandLineArguments{
        private final ZakazX zakazX;
        private UserInterface userInterface;

        public CommandLineArguments(ZakazX zakazX,
                                    UserInterface userInterface) {
            this.zakazX = zakazX;
            this.userInterface = userInterface;
        }

        public ZakazX getZakazX() {
            return zakazX;
        }

        public UserInterface getUserInterface() {
            return userInterface;
        }
    }
}
