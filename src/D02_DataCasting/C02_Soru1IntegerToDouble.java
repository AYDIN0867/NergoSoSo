package D02_DataCasting;

import java.util.Scanner;

public class C02_Soru1IntegerToDouble {
    public static void main(String[] args) {

       //Soru 1- Int olarak verilen 3 sayının ortalamasini double olarak yazdiran bir kod
        //yazin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen sayı1 giriniz :  ");
        int sayi1=scanner.nextInt();
        System.out.println("lütfen sayı2 giriniz :  ");
        int sayi2=scanner.nextInt();
        System.out.println("lütfen sayı3 giriniz :  ");
        int sayi3=scanner.nextInt();

        double sayiOrtalama=(sayi1+sayi2+sayi3)/3;

        System.out.println("Verilen 3 sayının ortalaması : "+sayiOrtalama);




    }
}
