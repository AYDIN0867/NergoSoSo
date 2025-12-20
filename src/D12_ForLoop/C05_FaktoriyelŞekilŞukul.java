package D12_ForLoop;

import java.util.Scanner;

public class C05_FaktoriyelŞekilŞukul {
    public static void main(String[] args) {

        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        // hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif 20 den küçük pozitif bit tamsayı giriniz...");
        int girilenSayi = scanner.nextInt();



        if (!(girilenSayi < 20 && girilenSayi > 0)) {

            System.out.println("vergiğiniz sayının faktoriyeli yukurıdaki şarta göre hesaplanamaz");

        } else {
            int carpım = 1;
            System.out.print(girilenSayi + "! =");

            for (int i = girilenSayi; i >= 2; i--) {

                carpım *=i;

                System.out.print(i+"*");

            }

            System.out.println("1=" + carpım);
            //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        }



    }

}

























//        } else {
//
//            System.out.print(girilenSayi+"!=");
//
//            for (int i = girilenSayi; i >=2; i--) {
//
//                carpım*=i;
//
//                System.out.print(i+"*");
//
//            }
//
//            System.out.println("1"+"="+carpım);





