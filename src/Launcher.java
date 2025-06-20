import component.Dolivka;

public class Launcher {
    public static void main(String[] args) {
        final Factory factory = new Factory(args);
        final Dolivka dolivka = factory.create();
        dolivka.start();
    }
}