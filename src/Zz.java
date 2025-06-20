public class Zz {

    private final double levelNow;

    private final double temperature;

    private int levelMax;

    public double getLevelNow() {
        return levelNow;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public void setLevelMax(final int levelMax) {
        this.levelMax = levelMax;
    }

    public Zz(double levelNow, double temperature) {
        this.levelNow = levelNow;
        this.temperature = temperature;
    }

    private double getLevelDoliv() {
        return (getLevelMax() - (30 - getTemperature()) * 0.6);
    }

}
