package D07_NestedIfelse;

import java.util.Scanner;

public class C01_NestedIfElse {

    public static void main(String[] args) {

        //Kullanıcıdan cinsiyetini ve yasını alın
        //Kadin,60 yas ve üzeri,Erkek 65 yas ve üzeri emekli olabilir
        //Cinsiyet ve yasini dikkate alarak "Emekli Olabilirsin"
        //veya "Emekli olamak için ... Yıldaha çalışman gerek" yazdırn
        //kulanıcı E veya K disinda bir cinsiyet girerse
        //veya 15 yasdan kucuk ve 80 yasdan buyuk yas girerse uyarın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz... Erkek içi E Kadın için K yazınız");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        if (!(cinsiyet == 'E' || cinsiyet == 'K')) {

            System.out.println("lütfen cinsiyetinizi doğru giriniz...");

        } else if (yas < 15 || yas > 80) {

            System.out.println("verilen yas için emeklilik yaşı hesaplanamaz");

        } else if (cinsiyet == 'E') {

            if (yas >= 65) {

                System.out.println("emekli olabilirsiniz...");

            } else if (yas < 65) {

                System.out.println( " emekli olabilmek için"+ (65 - yas) + " yıl daha çalışmalısınız ");

            }


        } else if (cinsiyet == 'K') {

            if (yas >= 60) {

                System.out.println("emekli olabilirsiniz...");

            } else if (yas < 60) {

                System.out.println( " emekli olabilmek için"+ (60 - yas) + " yıl daha çalışmalısınız ");

            }


        }

    }
}