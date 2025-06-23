package model.zakazy;

public class Zak832 extends Zak{
    private final double LEVELMIN = 40;
    private final double LEVELMAX = 70;

    public double getLEVELMIN() {
        return LEVELMIN;
    }

    public double getLEVELMAX() {
        return LEVELMAX;
    }

    public double getLevelNado() {
        return getLEVELMAX() - super.getLevelNado();
    }

//    public double getLitrsNado() {
//        return 0;
//    }
}
