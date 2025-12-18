package D12_ForLoop;

import java.util.Scanner;

public class C02_ForLoopYediIleBoluneBilme {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
//dahil) 7 ila bolunebilen sayilari yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir pozitif sayı giriniz...");
        int girilenSayi=scanner.nextInt();

        for (int i = 1; i <=girilenSayi ; i++) {

            if (i%7==0){

                System.out.print(i+" ");

            }


        }


    }
}
