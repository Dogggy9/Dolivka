package component;

import model.config.ZakazX;

public class Dolivka {
    private final DataPrinter dataPrinter;

    private final ZakazX zakazX;

    public Dolivka(DataPrinter dataPrinter, ZakazX zakazX) {
        this.dataPrinter = dataPrinter;
        this.zakazX = zakazX;
    }

    public void start(){

        dataPrinter.printInfoMessage("какой заказ");
    }
}
