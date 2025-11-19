package D09_SwitchStatements;

import java.util.Scanner;

public class C05_ISTQBSorusu {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board


        Scanner scanner=new Scanner(System.in);
        System.out.println("ISTQB kısatlmasındaki anlamını istediğiniz harfi belirtiniz....");
        char anlamıIstenenHarf=scanner.next().toUpperCase().charAt(0);

        switch (anlamıIstenenHarf){

            case 'I': System.out.println("International");
            break;
            case 'S': System.out.println("Software");
            break;
            case 'T': System.out.println("Testing");
            break;
            case 'Q': System.out.println("Qualifications");
            break;
            case 'B': System.out.println("Board");
            break;
            default: System.out.println("Yanlış harf girdiniz....");
        }

      //  Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        int girilenRakam=scanner.nextInt();

        switch (girilenRakam){

            case 1,2,3,4,5: System.out.println("HaftaIci");
            break;
            case 6,7: System.out.println("HaftaSonu");
            break;
            default: System.out.println("Yanlış numara girdiniz....");

        }

      // Kullanicidan ay numarasini alip mevsimi yazdirin.

        int ayNumarası=scanner.nextInt();

        switch (ayNumarası){

            case 12,1,2 :
                System.out.println("KIŞ");
                break;
            case 3,4,5:
                System.out.println("ILKBAHAR");
                break;
            case 6,7,8:
                System.out.println("YAZ");
                break;
            case 9,10,11:
                System.out.println("SONBAHAR");
                break;
            default:
                System.out.println("yanlış numara");
        }


    }
}
