package D03_WrapperVeMatematiksel_Islemler;

public class C01_WrapperClass {

    public static void main(String[] args) {


      String nutellaFiyat1="23";
      String nutellaFiyat2="45";

      //String olarak verilen iki ürünün fiyatını toplayın....

        System.out.println(nutellaFiyat1+nutellaFiyat2);

//icinde SADECE sayilar oldugundan emin oldugumuz Stringleri
//Wrapper class'lari kullarak sayiya cevirebiliriz...

int fiy1=Integer.parseInt(nutellaFiyat1);
int fiy2=Integer.valueOf(nutellaFiyat2);

        System.out.println(fiy1+fiy2);

        int sayi1=20;

        Integer sayi2=sayi1;



    }
}
