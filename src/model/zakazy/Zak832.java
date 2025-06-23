package model.zakazy;

public class Zak832 extends Zak{

    public double getLEVELMIN() {
        return 40;
    }

    public double getLEVELMAX() {
        return 70;
    }

    public double getLevelNado() {
        return getLEVELMAX() - super.getLevelNado();
    }

}
