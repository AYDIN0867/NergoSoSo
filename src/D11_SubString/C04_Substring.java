package D11_SubString;

import java.util.Scanner;

public class C04_Substring {
    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metin "ev" içeriyorsa "Ev gibisi var mi"
        // metin "iş" içeriyorsA "Çalışmak ne güzel"
        // metin hem "ev" hem  "iş" içeriyorsa "Evden çalışmak gibisi yok"
        // metin bu iki kelimeyi de içermiyorsa "Çok çalışmak lazim, çoook" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz....");
        String girilenMetin=scanner.nextLine();

        if (!girilenMetin.contains("ev")&&!girilenMetin.contains("iş")){

            System.out.println("Çok çalışmak lazim, çoook");
        }

       if (girilenMetin.contains("ev")){

            System.out.println("Ev gibisi var mi");
        }

        if (girilenMetin.contains("iş")){

            System.out.println("çalışmak ne güzel");
        }

        if (girilenMetin.contains("iş")&&girilenMetin.contains("ev")){

            System.out.println("Evden çalışmak gibisi yok");
        }



    }
}
