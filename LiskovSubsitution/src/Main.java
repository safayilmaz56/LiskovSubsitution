import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Toplayici toplayici = new Toplayici();
        Kare kare1 = new Kare(5);
        Kare kare2 = new Kare(9);
        Dikdortgen dikdortgen = new Dikdortgen(3,7);
        Cember cember = new Cember(2);

        ArrayList<ICevreHesap> cevreHesapArrayList = new ArrayList<>();
        ArrayList<IAlanHesap> alanHesapArrayList = new ArrayList<>();

        cevreHesapArrayList.add(kare1);
        cevreHesapArrayList.add(dikdortgen);
        cevreHesapArrayList.add(cember);

        alanHesapArrayList.add(kare2);
        alanHesapArrayList.add(dikdortgen);

        System.out.println(toplayici.cevreToplayici(cevreHesapArrayList));
        System.out.println(toplayici.alanToplayici(alanHesapArrayList));
    }
}