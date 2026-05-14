package D16_WhileLoop;

public class C01_WhileLoop {

    public static void main(String[] args) {

//eger baslangıc ve bitis degeri biliniyorsa
//veya bir işlemi kaç defa tekrarlayacağımız
//biliyorsak   for loop avantajlıdır çünkü while loop
//basalngıc degeri be bitis degeri ve artıs/azalıs
//miktarını bize otomatik olarak vermez


//1 den 10 a kadar (1 ve 10 dahil) tum sayıları
//toplayın...



sayılarArasınıTopla(2,3);
sayılarArasınıTopla(1,55);

//aynısını while loop ile yapalım
int toplam=0;
int sayi=1;

while (sayi<=10){

    toplam+=sayi;
    sayi++;

}

        System.out.println("while loop ile sonuc "+ toplam);

//20 den 30 a kadar olan çift sayıların toplamıbulunuz

        for (int i = 20; i <=30 ; i++) {



        }



    }

public static void sayılarArasınıTopla(int sayi1,int sayi2){

    int toplam=0;

    for (int i = sayi1; i <=sayi2 ; i++) {

        toplam+=i;

    }

    System.out.println(sayi1 + " den "+ sayi2+ " ye kadar sayıları  toplamı "+toplam);


}


}
