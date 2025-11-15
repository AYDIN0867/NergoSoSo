package D08_TernaryOperatörü;

import java.util.Scanner;

public class C01_TernaryOperatoru {
    public static void main(String[] args) {

      //  Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
//“Sayi 5’in tam kati” veya “Sayi 5’in kati degil” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz...");
        int sayi=scanner.nextInt();

        System.out.println(sayi%5==0? "sayi 5 in tam katı " : "sayı 5 in katı değil");

//Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
//“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.




    }
}
