package model.zakazy;

public interface Zakaz {

    public double getLEVELMAX();

    public double getLevelTopUp();

    public double getTEMPERATURENOMINAL();

    public double getLevelNow();

    public double getTemperatureNow();

    public double getLEVELMIN();

    public void setLevelNow(double levelNow);

    public void setTemperatureNow(double temperatureNow);

    public double getLevelNado();

    public double getLitrsNado();
}
