package D07_NestedIfelse;

import java.util.Scanner;

public class C05_ArtikYilSorusu {
    public static void main(String[] args) {

        /*

        Soru ) Interview Question Kullanicidan alınan yılın,artik yil olup olmadigini kontrol
etmek icin yil girmesini isteyin. Kural 1: 4 ile bolunemeyen yillar artik yil
degildir(4 ile bölünebilen artık yıldır) Kural 2: 4 ile bolunup 100 ile bolunemeyen
yillar artik yildir Kural 3: 4’un kati olmasina ragmen 100 ile
bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz");
        int girilenYil= scanner.nextInt();

        if(girilenYil%400==0){ //kural 3 bu

            System.out.println("girilen yil artık yıldır");

        } else if (!(girilenYil%100==0)&&girilenYil%4==0) { //kural 2

            System.out.println("artik yıldır");

        }else if (girilenYil%4==0){ //kural 1

            System.out.println("artık yıldır");

        }else System.out.println("Artık yıl değildir");


    }
}
