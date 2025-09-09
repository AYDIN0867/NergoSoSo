package D02_DataCasting;

import java.util.Scanner;

public class C04_Soru2HarfSonrakiHarf {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz...");
        char girilenharf=scanner.nextLine().charAt(0);

        // girilen harf a , b,c,d

        char sonrakiIlkHarf=(char)(girilenharf+1);

        System.out.println("girilen harften sonraki ilk harf "+sonrakiIlkHarf);


    }
}
