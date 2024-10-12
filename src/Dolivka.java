public class Dolivka {
    public static void main(String[] args) {
        double levelNow = 13;
        double temperature = 19;
        int litrsTotal = 100;
        double levelNado = 32;

        Zz431 zz431 = new Zz431(levelNow, temperature);

        System.out.println(zz431.display());
        System.out.println(zz431.poLitram(litrsTotal));
        System.out.println(zz431.poLevel(levelNado));

        Zz832 zz832 = new Zz832(levelNow, temperature);

        System.out.println(zz832.display());
    }
}