package D10_StringManipulations;

import java.util.Locale;

public class C01_char {
    public static void main(String[] args) {

        String cümle="BAĞ BAĞCININDIR";

        System.out.println(cümle.toLowerCase());//bağ bağcınındır

       System.out.println(cümle.toLowerCase(Locale.forLanguageTag("Tr")));//bağ bağcınındır

        //stringin ilk harfini yazıdırın

        String isim="Ramazan";
        System.out.println(isim.charAt(0)); //R

        //isimdeki bastan 5. harfi yazdirin
        System.out.println(isim.charAt(4));//z

        // son harfi yazdirin
        System.out.println(isim.length());//7
        System.out.println(isim.charAt(isim.length() - 1));//n

        // sondan 3. harfi yazidirin
        //isim=Ramazan
        //son karateri lenght-1
        //son length-3

        System.out.println(isim.charAt(isim.length() - 3));//z

        // sondan 5. harfi yazıdırn

        System.out.println(isim.charAt(isim.length() - 5));//m sondan
        System.out.println(isim.charAt(2));//m baştan


    }
}
