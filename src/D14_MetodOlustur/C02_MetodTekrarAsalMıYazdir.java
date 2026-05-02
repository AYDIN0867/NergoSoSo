package D14_MetodOlustur;

public class C02_MetodTekrarAsalMıYazdir {
    public static void main(String[] args) {

    //verilen sayının asal olup olmadığını yazdırın...

asalMiYazdir(33);
asalMiYazdir(21);
asalMiYazdir(7832);//Asal değildir



        }


    public static void asalMiYazdir(int sayi){

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){

                System.out.println("verilen " +sayi +" sayisi asal değildir" );
                break;
            }

            if (i==sayi-1){

                System.out.println("verilen " +sayi +" sayisi asal sayıdır");
            }








        }





    }




}


