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

    double getLitrs() {
        return (getLevelDoliv() - getLevelNow()) / 5 * 0.21 * 112;
    }

    private double getLevelDoliv() {
        return (getLevelMax() - (30 - getTemperature()) * 0.6);
    }

    String display() {
        return "При уровне " + getLevelNow() + "\nи температуре " + getTemperature() + "\nДоливаем до уровня " + getLevelDoliv();
    }
}
