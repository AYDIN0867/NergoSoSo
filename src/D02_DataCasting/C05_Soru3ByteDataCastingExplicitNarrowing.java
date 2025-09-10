package D02_DataCasting;

import java.util.Scanner;

public class C05_Soru3ByteDataCastingExplicitNarrowing {
    public static void main(String[] args) {


        //Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
//ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz..");
        double girilenSayi=scanner.nextDouble();

        byte sayi1=(byte)girilenSayi;

        System.out.println("girilen sayının -128 ile 127 arasındaki degeri "+sayi1);













    }
}
