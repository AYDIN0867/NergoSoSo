package D06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseNotGecmeSorusu {
    public static void main(String[] args) {


       // Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
       // kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not=scanner.nextDouble();

        if (not>=50){

            System.out.println("tebrikler dersi gectiniz");

        }else System.out.println("MALESEF KALDINIZ");



    }
}
