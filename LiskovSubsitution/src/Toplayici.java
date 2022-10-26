import java.util.ArrayList;

public class Toplayici {
    public double alanToplayici(ArrayList<IAlanHesap> sekiller){
        double toplam = 0;
        for (IAlanHesap sekil:sekiller){
            toplam += sekil.alanHesapla();
        }
        return toplam;
    }
    public double cevreToplayici(ArrayList<ICevreHesap> sekiller){
        double toplam = 0;
        for (ICevreHesap sekil : sekiller ){
            toplam += sekil.cevreHesapla();
        }
        return toplam;
    }
}
