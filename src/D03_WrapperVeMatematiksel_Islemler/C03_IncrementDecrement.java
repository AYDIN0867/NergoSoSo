package D03_WrapperVeMatematiksel_Islemler;

public class C03_IncrementDecrement {
    public static void main(String[] args) {

        /*

        Toplama veya carpma yaparak bir variable’in degerini artirabiliriz.
Increment isleminin kalici olmasi icin 3 farkli sekilde assignment yapilabilir.

         */


   int sayi=3;

sayi=sayi+3;

        System.out.println("sayının 19.satırdaki degeri : "+ sayi);//


        int sayi1=13;

        sayi1=sayi1*3;

        System.out.println(sayi1);

        sayi1*=3;

        System.out.println(sayi1);

        int sayi5=3;

        sayi5-=1;

        System.out.println(sayi5);


        boolean kontrol=true;
        Boolean kont=false;

        String knt="false";
        boolean sonuc=Boolean.valueOf(knt);

        char chr='*';
        Character ch='p';
        char chr2=101;

        System.out.println(Character.valueOf(chr2));//e
        System.out.println(Character.isDigit('5'));//true
        System.out.println(Character.isAlphabetic('9'));//false
        System.out.println(Character.isAlphabetic('a'));//true








    }




}
