public class Daire implements ICevreHesap,IAlanHesap{

    private double yaricap;

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return 3 * yaricap * yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 6 * yaricap;
    }
}
