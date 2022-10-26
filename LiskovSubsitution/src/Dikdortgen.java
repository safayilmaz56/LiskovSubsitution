public class Dikdortgen implements ICevreHesap,IAlanHesap{
    private double kenar1,kenar2;

    public Dikdortgen(double kenar1, double kenar2) {
        setKenar1(kenar1);
        setKenar2(kenar2);
    }

    public double getKenar1() {
        return kenar1;
    }

    public void setKenar1(double kenar1) {
        this.kenar1 = kenar1;
    }

    public double getKenar2() {
        return kenar2;
    }

    public void setKenar2(double kenar2) {
        this.kenar2 = kenar2;
    }

    @Override
    public double alanHesapla() {
        return kenar1 * kenar2;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (kenar1 + kenar2);
    }
}
