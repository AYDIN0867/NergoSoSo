package D07_NestedIfelse;

import java.util.Scanner;

public class C03_KmHesabı {
    public static void main(String[] args) {

        /*

         Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin.

         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen aldıgınız mesafeyi km olarak giriniz");
        int girilenKM= scanner.nextInt();
        scanner.nextLine();//bu satırı buffer hatası almamak için koyduk
        //buffer hatası şundan kaynaklanır...sayısal veri almayı sağlayan data türleri ;
        //byte,short, integer ,long ve virgüllü olan float ve double bunlar kendielrinden
        //sonra \n bırakırlar bu da alt satıra gec demektir bu nedenle kendilerinden sonra METINSEL
        // data türü geldiğinde bu satırı otomatikmen atlatırlar yokmuş gibi davranırlar buna da
        //buffer hatası denir...

        System.out.println("lütfen çevirmek istediğiniz birimi yazınız metre için  M santimetre için Cm yazın");
        String istenenBirim=scanner.nextLine().toUpperCase();

        if (!(istenenBirim.equals("M"))&&(!(istenenBirim.equals("CM")))){

            System.out.println("istediginiz birim sisteme kayitli degil");

        } else if (istenenBirim.equals("M")) {

            System.out.println("girdiğiniz mesafenin metre olarak karşığı" + girilenKM*1000  );

        }else  System.out.println("girdiğiniz mesafenin santimetre olarak karşığı" + girilenKM*1000000);


    }
}
