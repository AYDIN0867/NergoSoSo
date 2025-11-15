package D08_TernaryOperatörü;

import java.util.Scanner;

public class C02_TernaryEskenarUcgen {
    public static void main(String[] args) {


       // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
//“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz...");
        int kenar1=scanner.nextInt();
        int kenar2=scanner.nextInt();
        int kenar3=scanner.nextInt();

        System.out.println(kenar1==kenar2&&kenar1==kenar3 ? "eşkenar üçgendir" :" eşkenar üçgen değildir");





    }
}
