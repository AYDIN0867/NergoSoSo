package D12_ForLoop;

import java.util.Scanner;

public class C07_TerstenYazdırma {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz...");
        String girilenMetin=scanner.nextLine();
         String tersMetin="";

        for (int i = girilenMetin.length()-1; i>=0 ; i--) {


           // tersMetin+=i;
            tersMetin+=girilenMetin.charAt(i);
            
        }

        System.out.println(tersMetin);
    }
}
