package D14_MetodOlustur;

public class C03_kucukOlmayaniYazdir {

    public static void main(String[] args) {

     //verilen iki sayıdan kucuk olmayanı yazdıran bir metod olusturun;
      kucukOlmayaniYazdir(23,42);//42
      kucukOlmayaniYazdir(23,23);//23

    }


    public static void kucukOlmayaniYazdir(int sayi1,int sayi2){



        System.out.println(sayi1>sayi2 ? sayi1 : sayi2);

    }



}
