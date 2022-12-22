package pr3_zad2;

public class Convertor
{
    double rubles;

    Convertor(double rubles) {
        this.rubles = rubles;
    }

    public double toUSD() {
        return rubles / 65.35;
    }

    public double toEUR() {
        return rubles / 61.34;
    }


}
