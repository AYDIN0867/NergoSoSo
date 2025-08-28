package D01_JavaGiris;

import java.util.Scanner;

public class D04_JohnDoeKimlikKartıYazimi {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        // Yasiniz : 44
       //Kaydiniz basariyla tamamlanmistir



       //1. ADIM scanner class ı olusturulur
        Scanner scanner=new Scanner(System.in);
       //2.ADIM kullanıcaya istenen bilgi sorulur
       System.out.println("Lutfen isminizi yazar mısınız ? :");
       //3. adım
       String isim=scanner.nextLine();
       //4. adım soyisim sorulur
        System.out.println("Lütfen Soyisminizi yazar misiniz :");
       //5. adım soy isim kod içine  dahil edilir
       String soyIsim=scanner.nextLine();
       //6. yaş bilgisi istenir
        System.out.println("Lütfen yaşınızı yazar misiniz");
        int  yas=scanner.nextInt();

        //Isminiz : John
        //Soyisminiz : Doe
        // Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir

        System.out.println("Isminiz : "+isim+
                           "\nSoyisminiz : "+ soyIsim+
                            "\nYasiniz : "+yas+
                              "\nKaydiniz basariyla tamamlanmistir");








    }
}
