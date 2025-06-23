package model.zakazy;

public class Zakaz431 implements Zakaz{

    double levelNow;
    double temperatureNow;
    double temperatureNominal = 30;
    final double levelMin = 25;
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
        return getLEVELMAX()-((getTemperatureNominal()-getTemperatureNow())/5*3);
    }

    @Override
    public double getLitrsNado() {
        return (getLevelNado()-getLevelNow())/5*0.21*112;
    }
}
