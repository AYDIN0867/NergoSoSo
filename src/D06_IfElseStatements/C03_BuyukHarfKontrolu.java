package D06_IfElseStatements;

import java.util.Scanner;

public class C03_BuyukHarfKontrolu {
    public static void main(String[] args) {

          /*

        Kullanicidan bir harf girmesini isteyin
        girilen harfin buyuk yada kucuk oldugunu yazdirin


         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen harf giriniz");
        char girilenHarf=scanner.next().charAt(0);


        if (girilenHarf>='A'&& girilenHarf<='Z'){

            System.out.println("Girdiğiniz harf buyuk harftir");

        }else System.out.println("Girdiğiniz harf kucuk harftir");


        if (Character.isUpperCase(girilenHarf)){

            System.out.println("girilen harf büyüktür");
        }else System.out.println("girilen harf kucuktur");

    }
}
