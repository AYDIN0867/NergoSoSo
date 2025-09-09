package D02_DataCasting;

import java.util.Scanner;

public class C03_Soru1DoubleToInteger {
    public static void main(String[] args) {

        //Soru 1- double olarak verilen 3 degerin ortalamasini (int)k yazdiran bir kod
        //yazin


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen sayı1 giriniz :  ");
        double sayi1=scanner.nextDouble();
        System.out.println("lütfen sayı2 giriniz :  ");
        double sayi2=scanner.nextDouble();
        System.out.println("lütfen sayı3 giriniz :  ");
        double sayi3=scanner.nextDouble();

        int sayiOrtalama= (int) ((sayi1+sayi2+sayi3)/3);

        System.out.println("verilen sayıların ınteger olarak ortalaması :"+sayiOrtalama);

    }
}
