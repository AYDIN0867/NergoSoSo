package D11_SubString;

import java.util.Scanner;

public class C06_MailSoruContains {
    public static void main(String[] args) {

       /*
        SORU : kullanicidan bir mail alin
         - mail "@" icermiyorsa "gecersiz mail"
                - mail "@gmail.com" icermiyorsa, "mail gmail olmali"
                - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        yazdirin.

       */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen mailinizi giriniz...");
        String girilenMetin=scanner.nextLine();

        if (!girilenMetin.contains("@")){

            System.out.println("gecersiz mail");

        } else if (!girilenMetin.contains("@gmail")) {

            System.out.println("mail gmail olmali");

        } else if (!girilenMetin.endsWith("@gmail.com")) {

            System.out.println("mailde yazim hatasi var");

        }else System.out.println("mailiniz gecerli teşekkür ederim");



    }
}
