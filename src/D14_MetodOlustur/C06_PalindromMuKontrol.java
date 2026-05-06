package D14_MetodOlustur;

import D12_ForLoop.C07_TerstenYazdırma;

public class C06_PalindromMuKontrol {

    public static void main(String[] args) {


        //verilen metnin palindrom olup olmadıgını kontrol edin
        //palindrom ise true değil se false donduren bir metod olusturn

        System.out.println(palindromMuBakVeDondur("Kazak"));//true
        System.out.println(palindromMuBakVeDondur("Kalem")); //false
        System.out.println(palindromMuBakVeDondur("ey edip adanada pide ye"));//true
        System.out.println(palindromMuBakVeDondur("1235321"));//true
        System.out.println(palindromMuBakVeDondur("  "));
        System.out.println(palindromMuBakVeDondur("11111111111111111111111"));
    }

    public static boolean palindromMuBakVeDondur(String metin){

        String tersMetin=C07_MetniTerseCevirDondurMetodu.metnintersiniDondur(metin);

        if (metin.equalsIgnoreCase(tersMetin)){

            return true;
        }else {

            return false;
        }



    }






}
