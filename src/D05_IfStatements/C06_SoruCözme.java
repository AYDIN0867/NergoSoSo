package D05_IfStatements;

import java.util.Scanner;

public class C06_SoruCözme {

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

if (girilenSayi1<girilenSayi2){

    System.out.println("birinci  sayi daha kucuk");
}

if (girilenSayi1>0){

    System.out.println("birinci sayi sıfırdan buyuk");
}

if (girilenSayi2>50){
    System.out.println("sayi2 50 den büyük");
        }

if (girilenSayi2%5==0){
            System.out.println("sayi2 5'e bölünebilen bir sayıdır");
        }

if(!(girilenSayi1<girilenSayi2)&&!(girilenSayi1>0)&&!(girilenSayi2>50)&&!(girilenSayi2%5==0)){

    System.out.println("ya ne biçim sayı sectiniz aynı amcam gibi çok gıcık");

}

    }
}
