package D02_DataCasting;

import java.util.Scanner;

public class C06_SoruDouble {
    public static void main(String[] args) {

       // Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
       // isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki adet ondalıklı  sayi giriniz..");

        double girilenSayi1=scanner.nextDouble();
        double girilenSayi2=scanner.nextDouble();

        int sayilarinBolumu=(int)(girilenSayi1/girilenSayi2);
        System.out.println("iki sayinin bolumlerinin tamsayı sonucu  :"+sayilarinBolumu);

//Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
//ve bolum isleminin sonucununun tamsayi kismini yazdirin.




    }
}
