package D14_MetodOlustur;

import java.util.Scanner;

public class C10_DogruSifreAlma {
    public static void main(String[] args) {

        // Kullanıcıdan bir sifre isteyin
        // C08 daki metodu kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin,
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini söyleyin


        //Kullanıcıdan bir sifre isteyin

        Scanner scanner=new Scanner(System.in);
        String sifre;
        int sayac=0;
        boolean sifreGecerliMi=false;

        for (int i = 1; i <100000 ; i++) {

            System.out.println("lütfen bir şifre giriniz");
            sifre=scanner.nextLine();
            sifreGecerliMi=C08_SifreKontrol.sifreDogruMuKontrol(sifre);

            if (sifreGecerliMi==true){

                System.out.println(i+ " doğru sifreyi girdiniz...");
                break;
            }


        }





    }
}
