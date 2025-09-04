package D01_JavaGiris;

import java.util.Scanner;

public class D06_SoruCozumu {

    public static void main(String[] args) {

     //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz : ");
        String girilenIsim=scanner.nextLine().substring(0,1);
        System.out.println("Lütfen soyisminizi giriniz");
        String girilenSoyIsim=scanner.nextLine();
        System.out.println("lütfen yasınızı giriniz ....");
        int girilenYas=scanner.nextInt();


        System.out.println("girilen bilgiler :"+girilenIsim+" "+girilenSoyIsim+" ,"+girilenYas);





    }
}
