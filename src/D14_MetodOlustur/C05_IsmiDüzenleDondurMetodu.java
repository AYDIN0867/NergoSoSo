package D14_MetodOlustur;

public class C05_IsmiDüzenleDondurMetodu {

    //Verilen isim ve soyismi alip
    //Isim ve soyısmin ilk harfleri buyuk diğer harfler kucuk olacak sekilde duzenleyip
    //isim bosluk soy isim seklinde donduren metod olusturun
    //input : isim : Ali soyisim: YILMAZ metod return Ali Yilmaz




    public static void main(String[] args) {

        String ad="nergis";
        String soyAd="aydın";

        ismiDuzenleDondurMetodu("","nn");


    }


    public static String ismiDuzenleDondurMetodu(String gumgum, String bumbum){

     String duzenmisIsim=gumgum.substring(0,1).toUpperCase()+gumgum.substring(1).toLowerCase()+" "
                         +bumbum.substring(0,1).toUpperCase()+bumbum.substring(1).toUpperCase();

       return duzenmisIsim;
    }



}


