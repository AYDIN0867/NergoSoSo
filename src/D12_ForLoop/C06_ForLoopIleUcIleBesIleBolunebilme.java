package D12_ForLoop;

import java.util.Scanner;

public class C06_ForLoopIleUcIleBesIleBolunebilme {

    public static void main(String[] args) {

        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        //tamsayilari yazdirin, sira
        //- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        //yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tmasayı giriniz...");
        int girilenSayı=scanner.nextInt();

        for (int i = 1; i <=girilenSayı ; i++) {

            if (i%3==0&&i%5==0){

                System.out.print("fizzBuzz");

            } else if (i%3==0) {

                System.out.print("fizz ");

            }else if (i%5==0) {

                System.out.print("buzz ");

            } else System.out.print(i+ " ");
//1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzBuzz

        }






        


    }
}
