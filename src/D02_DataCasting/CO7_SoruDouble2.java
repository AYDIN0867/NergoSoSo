package D02_DataCasting;

import java.util.Scanner;

public class CO7_SoruDouble2 {
    public static void main(String[] args) {

        //Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
//ve bolum isleminin sonucununun tamsayi kismini yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir adet ondalıklı ve bir adet tamsayi  giriniz..");

        double girilenSayi1= scanner.nextDouble();
        int girilenSayi2=scanner.nextInt();

        int ikiSayininBolumu=(int)(girilenSayi1/girilenSayi2);



        System.out.println("iki sayının bolumu : "+ ikiSayininBolumu);



    }
}
