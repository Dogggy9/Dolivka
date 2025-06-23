package model.zakazy;

public interface Zakaz {

    public double getLEVELMAX();

    public double getLevelTopUp();

    public double getTemperatureNominal();

    public double getLevelNow();

    public double getTemperatureNow();

    public double getLevelMin();

    public void setLevelNow(double levelNow);

    public void setTemperatureNow(double temperatureNow);

    public double getLevelNado();

    public double getLitrsNado();
}
