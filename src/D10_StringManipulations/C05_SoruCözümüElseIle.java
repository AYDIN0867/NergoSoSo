package D10_StringManipulations;

import java.util.Scanner;

public class C05_SoruCözümüElseIle {
    public static void main(String[] args) {

        // kullanıcıdan şifre oluşturmak üzere sifre isteyin
        // sifreyi iki kere isteyin
        // eger metin  aynı oldugu halde yazım farklılıgı varsa
        // "Lütfen yazimi kontrol edin "yazdırın...
        //  Eger karakter farkliliği varsa
        // "Girilen sifreler farkli" yazdirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen şifrenizi giriniz");
        String sifre=scanner.nextLine();
        System.out.println("lütfen şifrenizi tekrar giriniz...");
        String yeniSifre=scanner.nextLine();


      if (sifre.equalsIgnoreCase(yeniSifre)){

          System.out.println("lütfen yazımı kontrol edin");

      } else {

          System.out.println("şifreler farkli");
      }






    }
}
