package D11_SubString;

public class C02_SubstringsIkiParametre {
    public static void main(String[] args) {

        String str="giden gitmiştir gittiği gün bitmiştir";

        //ilk kelime hariç yazdırın...
         int indexIlkBosluk=str.indexOf(" ");
        System.out.println(str.substring(indexIlkBosluk)); //gitmiştir gittiği gün bitmiştir

      //sadece 3. harfi String olarak başka bir variable'ye kaydedin

        String ucuncuHarf=str.substring(2,3);
        System.out.println(ucuncuHarf);//d

        //7.indeksteki harfi büyük harf olarak yazdırın
        //"giden gitmiştir gittiği gün bitmiştir"
        System.out.println(str.substring(7, 8).toUpperCase());//İ
     //başlangıc ve bitiş indeksleri aynı olursa
        System.out.println(str.substring(2, 2));//"" hiçlik verir
        // başlangıc indeksi bitiş indeksinden büyük olursa
        //System.out.println(str.substring(3, 2));//StringIndexOutOfBoundsException
        //Baştan 10. karakteri yazdırırken 2 adet yöntemi de kullanalım
        System.out.println(str.charAt(9));//m
        System.out.println(str.substring(9, 10));//m

        //15. index ten başlayıp 8 karakter yazdirin

        System.out.println(str.substring(15, 23));// gittiği

        // baştan 3 .karakterden başlayıp,
        // sondan 3. karaktere kadar (dahil) olan bolumu yazdırın
        //"giden gitmiştir gittiği gün bitmiştir"
        System.out.println(str.substring(2, str.length() - 2));//den gitmiştir gittiği gün bitmişt


    }
}
