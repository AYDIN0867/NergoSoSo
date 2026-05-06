package D14_MetodOlustur;

public class C07_MetniTerseCevirDondurMetodu {


    public static void main(String[] args) {




    }


    public static String metnintersiniDondur(String metin){

        String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin+=metin.charAt(i);
        }

        return tersMetin;

    }






}
