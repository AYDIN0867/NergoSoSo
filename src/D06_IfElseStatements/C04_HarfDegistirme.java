package D06_IfElseStatements;

import java.util.Scanner;

public class C04_HarfDegistirme {
    public static void main(String[] args) {

        //Kullanıcıdan bir harf isteyin
        // harf kucuk ise BUYUK
        //harf buyuk ise KUCUK yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen harf giriniz");
        char girilenHarf = scanner.next().charAt(0);

//ascı TABLE göre char data türündeki karakterlerin matematiksel
//karşılıkları vardır örneğin küçük a 97 kucuk 98 kucuk c 99 bu şkeilde artarak devam eder
//buyuk A ise 65  B ise 66 Buyuk C 67 bu şekilde devam eder

        if (girilenHarf >= 'A' && girilenHarf <= 'Z') {

            System.out.println((char) (girilenHarf + 32));

        } else System.out.println((char) (girilenHarf - 32));

        if (Character.isUpperCase(girilenHarf)) {

            System.out.println(Character.toLowerCase(girilenHarf));


        }else System.out.println(Character.toUpperCase(girilenHarf));

    }
}