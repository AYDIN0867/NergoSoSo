package D03_WrapperVeMatematiksel_Islemler;

import java.util.Scanner;

public class C02_ModulusSoru1 {
    public static void main(String[] args) {

        //Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayi giriniz....");
        int verilenSayi=scanner.nextInt();

        int birlerBasamagi=verilenSayi%10;
        int sayınınUcBasamakliHali=verilenSayi/10;
        int onlarBasamagi=sayınınUcBasamakliHali%10;
        int sayınınIkiBsamaklıHali=sayınınUcBasamakliHali/10;
        int yuzlerBasamagi=sayınınIkiBsamaklıHali%10;
        int sayınıninBinlerBasamagi=sayınınIkiBsamaklıHali/10;


        System.out.println("Verilen Dört basamaklı sayının rakamları toplamı : " +(birlerBasamagi+onlarBasamagi+yuzlerBasamagi+sayınıninBinlerBasamagi));









    }
}
