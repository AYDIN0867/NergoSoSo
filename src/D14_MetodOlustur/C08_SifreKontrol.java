package D14_MetodOlustur;

public class C08_SifreKontrol {

    public static void main(String[] args) {


        //Soru 4: verilen sifre icin
        // asagidaki sartlari gereken tum eksiklikleri yazdıran
        //tum sartlar kontrol edildikten sonra
        //sifrede hata YOKSA true, VARSA false DONDUREN
        // bir metod olusturun

        //-ilk karakter kucuk harf olmalı
        // son karakter rakam olmalı
        //sifre bosluk icermemeli
        //uzunlugu en az 10 karakter olmalı
        System.out.println(sifreDogruMuKontrol("abcd "));
        System.out.println(sifreDogruMuKontrol("acbd1234566"));//true

    }

    public static boolean sifreDogruMuKontrol(String sifre){
        int sayac=0;
        //-ilk karakter kucuk harf olmalı

        char ilkKarakter=sifre.charAt(0);
        if (!Character.isLowerCase(ilkKarakter)){

            System.out.println("hey dostum girdiğin şifrenin ilk karakteri kucuk harf olmalı");
            sayac++;
        }

        // son karakter rakam olmalı
        char sonKarakter=sifre.charAt(sifre.length()-1);
        if (!Character.isDigit(sonKarakter)){

            System.out.println("hey moruk son karakter rakam olmalı");
            sayac++;
        }

        //sifre bosluk icermemeli

        if (sifre.contains(" ")){

            System.out.println("hey zavazingo sifre boşluk içermemeli");
            sayac++;
        }

        //uzunlugu en az 10 karakter olmalı

        if (!(sifre.length()>10)){

            System.out.println("hey zirzop sifre en az 10 karakter olmaı");
            sayac++;
        }

        if (sayac==0){

            return true;
        }else {

            return false;
        }


    }
}
