import java.lang.Math;

public class Main {
    public static double pierwiastekSzescienny(double x) {
        return Math.pow(x, 1.0/3.0);
    }

    //metoda herona uzależniona od dokładności epsilon, pętla while wykonuje się tak długło póki jest mniejsza od epsilon
    public static double metodaHerona(double x, double epsilon) {
        double a = x;
        while (true) {
            double b = (a + x/a) / 2.0;
            if (Math.abs(a - b) < epsilon) {
                return b;
            }
            a = b;
        }
    }
    //metoda herona ale zamiast epsilon jest uzależniona od ilości kroków)
    public static double metodaHeronaKroki(double x, int n) {
        double a = x;
        for (int i = 0; i < n; i++) {
            double b = (a + x/a) / 2.0;
            a = b;
        }
        return a;
    }

    public static void main(String[] args) {

        //do wyświetlenia dodatkowo użyta metoda round
        System.out.println("Pierwsiastek szczecienny: "+Math.round(pierwiastekSzescienny(125)));
        System.out.println("Metoda Herona: "+metodaHerona(2, 0.001));
        System.out.println("Metoda Herona Kroki: "+metodaHeronaKroki(2, 5));

    }
}
