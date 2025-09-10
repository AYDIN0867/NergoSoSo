package D02_DataCasting;

import java.util.Scanner;

public class C04_Soru2HarfSonrakiHarf {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz...");
        char girilenHarf=scanner.nextLine().charAt(0);

        // girilen harf a , b,c,d

        char sonrakiIlkHarf=(char)(girilenHarf+1);//b
        char sonrakiIkinciHarf=(char)(girilenHarf+2);
        char sonrakiUcuncuHarf=(char)(girilenHarf+3);

        System.out.println("girilen harften sonraki ilk 3 harf "+sonrakiIlkHarf+" "+sonrakiIkinciHarf+" "+sonrakiUcuncuHarf);

//Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
//ile 127 arasindaki bir sayiya donusturup yazdirin.






    }
}
