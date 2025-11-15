package D09_SwitchStatements;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {

//Ornegin kullanicinin rakam olarak girdigi gun numarasının ismini yazınız


        Scanner scanner=new Scanner(System.in);
        System.out.println("gününü yazmak istediğiniz rakamı girinix");
        int rakam= scanner.nextInt();
        System.out.println("lütfen ay ismi giriniz");
        String girilenAy=scanner.nextLine();

        if (rakam==1){
            System.out.println("Pazartesi");
        } else if (rakam==2) {
            System.out.println("Salı");
        }else if (rakam==3) {
            System.out.println("Çarşamba");
        } else if (rakam==4) {
            System.out.println("Perşembe");
        } else if (rakam==5) {
            System.out.println("Cuma");
        } else if (rakam==6) {
            System.out.println("Cumartesi");
        } else if (rakam==7) {
            System.out.println("Pazar");

        }else System.out.println("girdiğiniz rakam için gün adı yoktur");

        //==========================SwitchStatemens ile Çözüm==========================//

        switch (rakam){

            case 1: System.out.println("Pazartesi");
            break;
            case 2: System.out.println("Salı");
            break;
            case 3: System.out.println("Çarşamba");
            break;
            case 4: System.out.println("Perşembe");
            break;
            case 5: System.out.println("Cuma");
            break;
            case 6: System.out.println("Cumartesi");
            break;
            case 7: System.out.println("Pazar");
            break;
            default:
                System.out.println("verdiğiniz rakamın gün karşılığı yoktur....");



        }

    }
}
