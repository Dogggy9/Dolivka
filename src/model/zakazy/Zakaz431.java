package model.zakazy;

public class Zakaz431 implements Zakaz{

    double levelNow;
    int temperature;
    final double levelMin = 25;
    final double levelMax = 40;
    double levelTopUp;

    @Override
    public double getLevelMax() {
        return 0;
    }

    @Override
    public double levelTopUp() {
        return 0;
    }
}
