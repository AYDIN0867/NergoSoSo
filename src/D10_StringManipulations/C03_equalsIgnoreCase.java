package D10_StringManipulations;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ALi";

     /*

     Stringleri karşılaştırmak için == kullandığımızda
     hem METNI hemde String in referansini kontrol eder.


     == ile karşılaştırdıgımızda METNI ayni olan Stringler icin
     bazen true bazen false sonuc verir.
     Bunu ilerde göreceğiz ama şimdilik STRING ler i karşılaştırmak icin
     bazen true bazen false sonuc verir

  equals verilen stringleri SADECE METIN olarak karşılaştırır

      */

        if (str1.equals(str2)){

            System.out.println("st1 str2 ye eşittir");
        }else System.out.println("eşit değildir");


        if (str1.equalsIgnoreCase(str2)){

            System.out.println("st1 str2 ye eşittir");
        }else System.out.println("eşit değildir");

    }
}
