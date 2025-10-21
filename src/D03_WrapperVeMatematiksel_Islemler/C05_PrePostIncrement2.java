package D03_WrapperVeMatematiksel_Islemler;

public class C05_PrePostIncrement2 {
    public static void main(String[] args) {

     int a=10;

        System.out.println("a 'nın degeri : "+ ++a);//11

     int b =a++;

        System.out.println("b'nin degeri : "+ b);//b=11, a=12
         int c=b++ + a;

        System.out.println("c'nin degeri : "+ c);//23 b=12

        System.out.println("son toplam : "+(a+b+c));//23+12+12=47


    }
}
