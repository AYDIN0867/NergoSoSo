package D05_IfStatements;

import java.util.Scanner;

public class C08_SoruÇözümüFlagYontemi {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı isteyin
        //girilen sayılara göre asagıdaki degerlendirmeleriyazdırın
        //1-sayi1<sayi2 ise "birinci  sayi daha kucuk"
        //2- sayi1 pozitif ise "birinci sayi sıfırdan buyuk"
        //3- sayi2 50 den buyuk ise "ikinci sayı 50 den buyuk"
        //4-sayi2 5 ile bolunrbiliyorsa "ikinci  sayı 5 in tam kati"
        //5- eger konsolde yukarıdakilerin HICBIRI yazdırılmasa
        // "nasıl sayı sectiniz , hicbir sarti sağlamayor" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        int girilenSayi1=scanner.nextInt();
        int girilenSayi2=scanner.nextInt();
        int flag=13;

       //1-sayi1<sayi2 ise "birinci  sayi daha kucuk"
        if (girilenSayi1<girilenSayi2){
            System.out.println("birinci  sayi daha kucuk");
            flag=42;

        }
        //2- sayi1 pozitif ise "birinci sayi sıfırdan buyuk"
        if (girilenSayi1>0){
            System.out.println("birinci sayi sıfırdan buyuk");
           flag=42;

        }

        //3- sayi2 50 den buyuk ise "ikinci sayı 50 den buyuk"
        if (girilenSayi2>50){
            System.out.println("sayi2 50 den büyük");
            flag=42;
        }
        //4-sayi2 5 ile bolunrbiliyorsa "ikinci  sayı 5 in tam kati"
        if (girilenSayi2%5==0){
            System.out.println("sayi2 5'e bölünebilen bir sayıdır");
            flag=42;
        }

        //5- eger konsolde yukarıdakilerin HICBIRI yazdırılmasa
        if(flag==13){

            System.out.println("ya ne biçim sayı sectin hiçbirine uymadı");

        }
    }
}
