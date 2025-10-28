package D05_IfStatements;

import java.util.Scanner;

public class C02_UcIleBoluneBilme {
    public static void main(String[] args) {

//Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
//sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int verilenSayi=scanner.nextInt();

        if(verilenSayi%3==0){

            System.out.println("Kullanıcının verdiği " +verilenSayi + " sayısı üç ile bölünebilir");


        }


        if (verilenSayi%5==0){

            System.out.println("Kullanıcının verdiği " +verilenSayi + " sayısı beş ile bölünebilir");
        }





    }
}
