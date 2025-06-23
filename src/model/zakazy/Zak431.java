package model.zakazy;

public class Zak431 extends Zak{

    public double getLEVELMIN() {
        return 25;
    }

    public double getLEVELMAX() {
        return 40;
    }

    public double getLevelNado() {
        return getLEVELMAX() - super.getLevelNado();
    }

    public double getLitrsNado() {
        return (getLevelNado()-getLevelNow())/5*0.21*112;
    }
}
