package D11_SubString;

public class C07_IndexOf {
    public static void main(String[] args) {

              String str="Java zamanla guzellesir";

//indexOf metodu bize aradığızın nerde oldugunu gösterir.
        // str de ilk a harfinin nerde oldugunu bulunuz...

        System.out.println(str.indexOf("a"));//1
        System.out.println(str.indexOf('z'));//5
        System.out.println(str.indexOf("z", 6));


//         aradığımızın nerde sorunsunun cevabını buluruz
//
//        System.out.println(str.indexOf('a'));//1 buldugu ilk a nin indexini getiri
//        System.out.println(str.indexOf("a"));// 1
//        System.out.println(str.indexOf("aman"));// amanın başladığı indexi yani 6 yı veririr
//        System.out.println(str.indexOf("la gu"));// la gu başladığı indexi yani 10 u veririr



        // istenirse belirlenen  indexten sonra da arama yapıla bilir

        System.out.println(str.indexOf("a", 5));// önce 5.indekse gider buradan aramaya başlar
        // ve başalangıç index olduğu için 5. indeks dahil bakar a yı bulaana kadar devam ede rve 6 yı verir
        System.out.println(str.indexOf("a", 6));//6




    }
}
