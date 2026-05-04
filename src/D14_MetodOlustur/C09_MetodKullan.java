package D14_MetodOlustur;

public class C09_MetodKullan {

    public static void main(String[] args) {

        C02_MetodTekrarAsalMıYazdir.asalMiYazdir(43);
        //6788909 asal mı

        C02_MetodTekrarAsalMıYazdir.asalMiYazdir(67889099);//verilen 67889099 sayisi asal değildir
        C02_MetodTekrarAsalMıYazdir.asalMiYazdir(987); //verilen 987 sayisi asal değildir
        C03_kucukOlmayaniYazdir.kucukOlmayaniYazdir(25, 12);//25
        C04_MetniTerstenYazdır.metniTerstenYazdir("Melahat"); //tahaleM
        System.out.println("");
        C04_MetniTerstenYazdır.metniTerstenYazdir("kursun yedim gonlumden akan " +
                "kan diye nedirden gelen içti su diye daldı derin derine");
        System.out.println("");

        System.out.println(C05_IsmiDüzenleDondurMetodu.ismiDuzenleDondurMetodu("ramazan", "aydın"));//Ramazan AYDIN

    }
}
