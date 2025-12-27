package D13_NestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoopSoru2 {

    public static void main(String[] args) {

        // kulanıcıdın satır ve sutun sayısını alıp aşağıdaki şekli yazdırın
        // foor loop kullanarak asagıdaki sayıları yazdırın

        //2 3 4 5 6
        //3 4 5 6 7
        //4 5 6 7 8
        //5 6 7 8 9
//ilk yani outer loop satırı
//ikinci yani inner loop sutunu temsil eder


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen satır sayısını giriniz...");
        int satıRSayisi=scanner.nextInt();
        System.out.println("lütfen sütün sayısını giriniz...");
        int sütunSayisi=scanner.nextInt();

        for (int i = 0; i <=satıRSayisi ; i++) {

            for (int j = 0; j <=sütunSayisi; j++) {

                System.out.print(i+j+" ");

            }

            System.out.println("");
        }




    }
}
