package D11_SubString;

public class C01_SubString {
    public static void main(String[] args) {

        String str= "Az ye az uyu az konuş";

        //str nin karakter sayısını bulunuz...
        System.out.println(str.length());//21


        //12. karakterini yazdırın.....
       System.out.println(str.charAt(11));//u

        System.out.println(str.substring(11, 12));//u
        System.out.println(str.substring(1));//z ye az uyu az konuş


        // 10. karakterden baslayıp, sona kadar butun metni yazıdırın...
        System.out.println(str.substring(9)); //uyu az konuş

        //"Az ye az uyu az konuş"
        // ilk kelime haric geriye kalan metni yazdırın "ye az uyu az konuş hayrete var"

        System.out.println(str.substring(2));// ye az uyu az konuş
        System.out.println(str.indexOf(" "));//2
        System.out.println(str.substring(str.indexOf(" "))); // ye az uyu az konuş
        System.out.println(str.substring(2));

        // ilk harf haric, kalan metni yazdirin..
        System.out.println(str.substring(1));//z ye az uyu az konuş

        // sondan 5.karakterini yazdirin...
        //"Az ye az uyu az konuş"
        System.out.println(str.substring(str.length() - 5,str.length()-4));//k


    }
}
