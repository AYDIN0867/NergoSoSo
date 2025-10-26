package D05_IfStatements;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.
         */


//        System.out.println("Lütfen bir sayı giriniz...");
//        int sayi=scanner.nextInt();
//
//        if(sayi%5==0){
//
//            System.out.println(sayi+ "sayısı 5 'e tam bölünür");
//
//
//        }else System.out.println(sayi + "sayısı 5'e tam bolünmez ulan adam gibi sayı ver");

/*

Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
Kullanici o veya O yazdiginda output Ocak olsun.
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char girilenHarf=scanner.nextLine().toLowerCase().charAt(0);
       // String girilenYazı=scanner.nextLine().substring(0,1);
        if(girilenHarf=='o'){
            System.out.println("Ocak");
        }

        if(girilenHarf=='ş'){
            System.out.println("Şubat");
        }

        if(girilenHarf=='m'){
            System.out.println("Mart");
        }

        if(girilenHarf=='n'){
            System.out.println("Nisan");
        }

        if(girilenHarf=='h'){
            System.out.println("Haziran");
        }

        if(girilenHarf=='t'){
            System.out.println("Temmuz");
        }

        if(girilenHarf=='a'){
            System.out.println("Ağustos");
        }

        if(girilenHarf=='e'){
            System.out.println("Eylül");
        }

        if(girilenHarf=='e'){
            System.out.println("Ekim");
        }

        if(girilenHarf=='k'){
            System.out.println("Kasım");
        }

        if(girilenHarf=='a'){
            System.out.println("Aralık");

        }



    }
}
