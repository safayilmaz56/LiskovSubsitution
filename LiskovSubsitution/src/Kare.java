public class Kare implements IAlanHesap,ICevreHesap{
   private double kenar;

    public Kare(double kenar) {
        setKenar(kenar);
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return kenar * kenar;
    }

    @Override
    public double cevreHesapla() {
        return 4 * kenar;
    }
}
