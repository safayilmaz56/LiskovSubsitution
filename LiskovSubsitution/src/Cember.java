public class Cember implements ICevreHesap{
    private double yaricap;

    public Cember(double yariCap) {
        setYariCap(yaricap);
    }

    public double getYariCap() {
        return yaricap;
    }

    public void setYariCap(double yariCap) {
        this.yaricap = yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 6 * yaricap;
    }
}
