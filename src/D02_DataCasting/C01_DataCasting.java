package D02_DataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

int b=12;
int  c=567;

//byte a=b;




        byte a=(byte)b;
        System.out.println(a);

        byte d= (byte) c;//explicit narrowig
        //Auto widening

        char harf='a';
        int sayi=100;

        System.out.println(harf+sayi); //197
        System.out.println(harf+1); //98

       char yeniHarf= (char) (harf+1);//

        System.out.println(yeniHarf); //b






    }
}
