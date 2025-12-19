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
        int carpım = 1;

        if (!(girilenSayi < 20 && girilenSayi > 0)) {

            System.out.println("vergiğiniz sayının faktoriyeli yukurıdaki şarta göre hesaplanamaz");


        } else {

            for (int i = 1; i <= girilenSayi; i++) {

                carpım *= i;

            }

            for (int i = girilenSayi; i <= 1; i--) {

                System.out.println(

                        girilenSayi + "!" + " " + "=" + i


                );
            }


        }
    }
}