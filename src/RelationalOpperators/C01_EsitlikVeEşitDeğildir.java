package RelationalOpperators;

public class C01_EsitlikVeEşitDeğildir {
    public static void main(String[] args) {

        int a=10;
        int b=15;

        System.out.println(a==b);//false
        System.out.println(a==b-5);//true

        boolean c;
        System.out.println(c=15==b);//true
//java da karşılaştırma oparatoru atama(=) işleminden ÖNCELIKLIDIR

c=15*a==10*b;
        System.out.println("c nin son hali : "+c);//true

        int j=15;
        int k=10;
        System.out.println(j!=k);//true
        System.out.println(j!=k-5);//true
        boolean m;

        System.out.println(m=15!=k);//true

        m=15*j!=10*k;

        System.out.println("m nin son degeri : "+m);//true


    }
}
