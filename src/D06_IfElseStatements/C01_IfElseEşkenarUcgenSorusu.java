package D06_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseEşkenarUcgenSorusu {

    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, kenar uzunlukları birbirine eşitse
        //“Eskenar ucgen” yazdirin.
        //değilse üçgen eşkenar üçden değildir yazdırn

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen ucgenin kenar uzunluklarını giriniz");

        int kenar1=scanner.nextInt();
        int kenar2=scanner.nextInt();
        int kenar3=scanner.nextInt();


        if (kenar1==kenar2&&kenar1==kenar3&&kenar1>0){
            System.out.println("verilen kenar uzunluklarına göre üçgen eşkenar üçgendir");
        }else System.out.println("verilen kenar uzunlukları birbirine eşit olmadığından üçgen eşkenar değildir");

    }
}
