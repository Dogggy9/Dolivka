package model.zakazy;

public class Zak431 extends Zak{
    private final double LEVELMIN = 25;
    private final double LEVELMAX = 40;

    public double getLEVELMIN() {
        return LEVELMIN;
    }

    public double getLEVELMAX() {
        return LEVELMAX;
    }

    public double getLevelNado() {
        return getLEVELMAX() - super.getLevelNado();
    }

    public double getLitrsNado() {
        return (getLevelNado()-getLevelNow())/5*0.21*112;
    }
}
