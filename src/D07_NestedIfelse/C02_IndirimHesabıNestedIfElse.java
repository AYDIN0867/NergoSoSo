package D07_NestedIfelse;

import java.util.Scanner;

public class C02_IndirimHesabıNestedIfElse {
    public static void main(String[] args) {

        //Kullanicidan aldıgı urun adedini ve indirimsiz fiyatını alin
        // kullaniciya musteri kartı olup olmadıgını sorun
        // musteri kartı varsa 10 urunden fazla alırsa %20
        //                                az alırsA %15 İNDİRİM YAPIN
        //Musteri kartı yoksa 10 urunden fazla alırsa %15
        // az alırsa %10 indirim yapın


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen aldıgınız ürün adedini belitiniz");
        int ürünAdedi=scanner.nextInt();
        System.out.println("Sayın müşteri üyeli kartını Varsa V yoksa Y yi tuşlayınız");
        char kartDurumu=scanner.next().toUpperCase().charAt(0);
        System.out.println("ürün fiyatını giriniz");
        double urunFiyatı=scanner.nextDouble();

        if (kartDurumu=='V'){

            if (ürünAdedi>=10){

                System.out.println(ürünAdedi*urunFiyatı*0.80);//%20 indirim ile

            } else if (ürünAdedi<=10&&ürünAdedi>0) {

                System.out.println(ürünAdedi*urunFiyatı*0.85);  //%15 indirim ile

            }else System.out.println("ürün adedi eksi olamaz lütfen bilgilerinizi doğru giriniz..");


        } else if (kartDurumu=='Y') {

            if (ürünAdedi>=10){

                System.out.println(ürünAdedi*urunFiyatı*0.85);//%15 indirim ile

            } else if (ürünAdedi<=10&&ürünAdedi>0) {

                System.out.println(ürünAdedi*urunFiyatı*0.90);  //%10 indirim ile

            }else System.out.println("ürün adedi eksi olamaz lütfen bilgilerinizi doğru giriniz..");


        }else System.out.println("Hatali bilgi verdiniz");


    }
}
