package D01_JavaGiris;

import java.util.Scanner;

public class D02_KullanıcıdanDegerAlma {

    public static void main(String[] args) {

        //Kullanıcıdan bilgi almak için Scanner class ını kullanırız...
        //1. adım Scanner objesi oluşturulur
        //Scanner scan=new Scanner(System.in);
        //2. adım kullanıcıdan ne alınmak istediği belirtirili
        // System.out.println("Lütfen bir tamsayi giriniz");


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz :");
        int sifre=scanner.nextInt();
        System.out.println("sifreniz : "+sifre);

//kullanicidan bir double,bir de int sayi alıp bunların toplamını ve carpımını yazdırın

        System.out.println("Lütfen ondalıklı bir sayı giriniz: ");
        double ondalıklıSayi=scanner.nextDouble();
        System.out.println("Lütfen tamsayı giriniz: ");
        int tamSayi=scanner.nextInt();

        System.out.println("iki sayının toplamı :"+(ondalıklıSayi+tamSayi));
        System.out.println("iki sayının carpımı :"+(ondalıklıSayi*tamSayi));



    }

}
