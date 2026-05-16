package D16_WhileLoop;

public class C02_WhileLoopCarpım {
    public static void main(String[] args) {

   //20 ila 30 arasındaki çift sayıların carpımı

        int baslangıcSayi=20;
        int carpim =1;

        while (baslangıcSayi<=30){

            if(baslangıcSayi%2==0){

                carpim*=baslangıcSayi;

            }

            baslangıcSayi++;

        }

        System.out.println("While loop ile 20 30 arası sayıların carpımı "+carpim);
//While loop ile 20 30 arası sayıların carpımı 230630400

    }
}
