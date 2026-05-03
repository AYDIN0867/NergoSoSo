package D14_MetodOlustur;

public class C04_MetniTerstenYazdır {
    public static void main(String[] args) {

        //metni tersten yazdıran bit metod olusturun....
        metniTerstenYazdir("ey edip adanada pide ye");
//ey edip adanada pide ye
        System.out.println("");
        metniTerstenYazdir("Nergis");//sigreN
        System.out.println("");
        metniTerstenYazdir("ramazan");//nazamar
        System.out.println("");
        metniTerstenYazdir("beyza");//azyeb
        System.out.println("");
        metniTerstenYazdir("Çağla");//alğaÇ

    }

    public static void metniTerstenYazdir(String metin){


        for (int i = metin.length()-1; i >=0 ; i--) {

            System.out.print(metin.charAt(i));

        }


    }



}
