package D13_NestedForLoop;

import java.util.Scanner;

public class C03_NestedForLoopTekrar {
    public static void main(String[] args) {

        /*

        * 1.1
        * *  2.1 2.2
        * * * 3.1 3.2 3.3
        * * * * 4.1 4.2 4.3 4.4

         */

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }


        /*
        for loop kullanarak asagidaki sayiları yazıdırın...
        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16
         */

        for (int i = 1; i <5 ; i++) {

            for (int j = 1; j < 5; j++) {

                System.out.print(i*j+" ");

            }


            System.out.println("");
        }



//kulanıcıdan satir ve surun sayisini alıp asagıdaki sekli yazdırın...
// orn satır =4 ,sutun=5 oldugunda
//23456
//34567
//45678
//56789


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen satır sayısını veriniz");
        int satırSayısı=scanner.nextInt();
        System.out.println("lütfen sutun sayısını veriniz...");
        int sutunSayisi=scanner.nextInt();

        for (int i = 1; i <= satırSayısı; i++) {

            for (int j = 1; j <= sutunSayisi; j++) {

                System.out.print(i+j);

            }

            System.out.println("");
        }


        /*

        kullanıcıdan satır sutun sayısını alınır ve aşağıdaki şekli çizdiriniz..

        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *

        orn satırSaysı=4
        orn sutunSaysısı=6

         */

        Scanner scanner1=new Scanner(System.in);
        System.out.println("lütfen şekil için satırsayısını giriniz...");
        int sekilSatırSayisi=scanner1.nextInt();
        System.out.println("lütfen şekil için sutunsayısnı  giriniz");
        int sekilSutunSayisi=scanner1.nextInt();


        for (int i = 1; i <=sekilSatırSayisi ; i++) {

            for (int j = 1; j <= sekilSutunSayisi; j++) {

                System.out.print("* ");

            }

            System.out.println("");
        }

/*

kullanıcından satır sayısını alıp asagıdaki sekli cizdirin

*
* *
* * *
* * * *
* * * * *

 */







    }
}
