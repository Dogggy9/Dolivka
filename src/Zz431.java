public class Zz431 extends Zz {

    public Zz431(final double levelNow, final double temperature) {
        super(levelNow, temperature);
        setLevelMax(40);
    }

    String poLitram(final int litrsTotal) {
        return "\nНа 100 литров можно долить до "+Math.round((litrsTotal-5.0)/112/0.21*5+getLevelNow());
    }

    public String poLevel(final double levelNado) {
        return "До уровня "+levelNado+" надо "+Math.round((levelNado-getLevelNow())/5*0.21*112+5)+" литров \n";
    }
}
