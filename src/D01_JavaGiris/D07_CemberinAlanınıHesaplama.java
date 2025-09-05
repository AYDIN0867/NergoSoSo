package D01_JavaGiris;

import java.util.Scanner;

public class D07_CemberinAlanınıHesaplama {
    public static void main(String[] args) {

        //- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen cemberin yarıçapını giriniz : ");
        double girilenYarıcap=scanner.nextDouble();
        double piSayisi=3.14;
        double daireninCevresi=2*piSayisi*girilenYarıcap;
        System.out.println(daireninCevresi);
        System.out.println("Dairenin cevresi : "+daireninCevresi);
        double daireninAlanı=piSayisi*girilenYarıcap*girilenYarıcap;
        System.out.println(daireninAlanı);
        System.out.println("Dairenin Alanı : "+ daireninAlanı);










    }
}
