package model.zakazy;

public class Zakaz832 implements Zakaz{

    double levelNow;
    double temperatureNow;
    double temperatureNominal = 30;
    final double levelMin = 40;
    final double levelMax = 70;
    double levelTopUp;

    @Override
    public double getLEVELMAX() {
        return levelMax;
    }

    @Override
    public double getLevelTopUp() {
        return levelTopUp;
    }

    @Override
    public double getTemperatureNominal() {
        return temperatureNominal;
    }

    public double getLevelNow() {
        return levelNow;
    }

    public double getTemperatureNow() {
        return temperatureNow;
    }

    public double getLevelMin() {
        return levelMin;
    }

    public void setLevelNow(double levelNow) {
        this.levelNow = levelNow;
    }

    public void setTemperatureNow(double temperatureNow) {
        this.temperatureNow = temperatureNow;
    }

    @Override
    public double getLevelNado() {
        return 0;
    }

    @Override
    public double getLitrsNado() {
        return 0;
    }
}