package component;

import component.zakazy.Zakaz431;
import component.zakazy.Zakaz832;

public class Dolivka {
    private final DataPrinter dataPrinter;

    private final Zakaz431 zakaz431;

    private final Zakaz832 zakaz832;

    public Dolivka(DataPrinter dataPrinter, Zakaz431 zakaz431, Zakaz832 zakaz832) {
        this.dataPrinter = dataPrinter;
        this.zakaz431 = zakaz431;
        this.zakaz832 = zakaz832;
    }

    public void start(){

    }
}
