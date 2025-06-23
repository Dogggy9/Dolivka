package model.zakazy;

public class Zakaz431 implements Zakaz{

    double levelNow;
    double temperatureNow;
    double TEMPERATURENOMINAL = 30;
    final double LEVELMIN = 25;
    final double LEVELMAX = 40;
    double levelTopUp;

    @Override
    public double getLEVELMAX() {
        return LEVELMAX;
    }

    @Override
    public double getLevelTopUp() {
        return levelTopUp;
    }

    @Override
    public double getTEMPERATURENOMINAL() {
        return TEMPERATURENOMINAL;
    }

    public double getLevelNow() {
        return levelNow;
    }

    public double getTemperatureNow() {
        return temperatureNow;
    }

    public double getLEVELMIN() {
        return LEVELMIN;
    }

    public void setLevelNow(double levelNow) {
        this.levelNow = levelNow;
    }

    public void setTemperatureNow(double temperatureNow) {
        this.temperatureNow = temperatureNow;
    }

    @Override
    public double getLevelNado() {
        return getLEVELMAX()-((getTEMPERATURENOMINAL()-getTemperatureNow())/5*3);
    }

    @Override
    public double getLitrsNado() {
        return (getLevelNado()-getLevelNow())/5*0.21*112;
    }
}
