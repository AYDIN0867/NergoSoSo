package D01_JavaGiris;

import java.util.Scanner;

public class D05_DikdörtgenAlanıHesaplama {

    public static void main(String[] args) {

      //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        // yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kısakenar uzunlugunu giriniz.... ");
        int kısaKenarUzunlugu=scanner.nextInt();
        System.out.println("Lütfen dikdörtgenin uzunkenar uzunlugunu giriniz.... ");
        int uzunKenarUzunlugu=scanner.nextInt();

        int dikdörtgeninAlanı=kısaKenarUzunlugu*uzunKenarUzunlugu;

        System.out.println("Dikdörtgenin Alanı : "+ dikdörtgeninAlanı+ "cm karedir");



    }

}
