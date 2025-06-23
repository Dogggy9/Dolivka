package model.zakazy;

public class Zak {

    private double levelNow;
    private double temperatureNow;
    private final double TEMPERATURENOMINAL = 30;

    public double getLevelNow() {
        return levelNow;
    }

    public void setLevelNow(double levelNow) {
        this.levelNow = levelNow;
    }

    public double getTemperatureNow() {
        return temperatureNow;
    }

    public void setTemperatureNow(double temperatureNow) {
        this.temperatureNow = temperatureNow;
    }

    public double getTEMPERATURENOMINAL() {
        return TEMPERATURENOMINAL;
    }

    public double getLevelNado() {
        return ((getTEMPERATURENOMINAL()-getTemperatureNow())/5*3);
    }

    public double getLitrsNado() {
        return 0;
    }
}
