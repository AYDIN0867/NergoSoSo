package D14_MetodOlustur;

public class C01_MetodOlustur1 {

    public static void main(String[] args) {

 /*
        Kullanıcıdan alinan bir metinden
        kullanicinin girdigi baslangic ve bitis indexleri arasindaki kısmı yazıdırn

        Kurallar:
        1-eger baslangic veya bitis index i negatif veya metin sinirleri dısında ise hataverin
        2-baslangic index'i bitis index inden buyukse hata mesaji verin
        3-baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olamlıdır

         */

String girilenİfade="ramazan";

int basIndex=2;
int bitIndex=4;

if(basIndex<0||bitIndex<0||basIndex>=girilenİfade.length()||basIndex>=girilenİfade.length()){

    System.out.println("verilen degerler hatalı...");
} else if (basIndex>bitIndex) {

    System.out.println("baslangıc ındex bitis indeksinden buyuk olmaz angut...");

}else{

    for (int i = basIndex; i <bitIndex; i++) {

        System.out.print(girilenİfade.charAt(i));

    }
    System.out.println("");
    System.out.println(girilenİfade.substring(2, 4));


}


    }
}
