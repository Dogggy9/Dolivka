package component.console;

import component.UserInputReader;

import java.util.Scanner;

public class ConsoleUserInputReader implements UserInputReader {

    @Override
    public double digit() {
        return new Scanner(System.in).nextDouble();
    }

    @Override
    public String str() {
        return new Scanner(System.in).nextLine();
    }
}
