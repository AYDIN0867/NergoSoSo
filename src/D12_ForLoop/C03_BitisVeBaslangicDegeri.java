package D12_ForLoop;

import java.util.Scanner;

public class C03_BitisVeBaslangicDegeri {
    public static void main(String[] args) {

   //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir baslangıc  sayısı giriniz...");
        int baslangıcDegeri=scanner.nextInt();
        System.out.println("lütfen pozitif bir bitis  sayısı giriniz...");
        int bitisDegeri=scanner.nextInt();
        int toplam=0;

        if (baslangıcDegeri>bitisDegeri){

            System.out.println("basalngıc degeri bitiş degerinrinden buyuk olmaz");
        } else  {

            for (int i =baslangıcDegeri ; i <=bitisDegeri ; i++) {

            toplam+=i;

            }

            System.out.println(baslangıcDegeri+" ile "+bitisDegeri+ " arasındaki sayıların toplamı : "+toplam);
        }





    }
}
