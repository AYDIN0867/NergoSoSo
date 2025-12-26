package D13_NestedForLoop;

public class C01_NestedForLoop {
    public static void main(String[] args) {

        //bir for loop kullanarak 1 2 3 4 yazdırın

        for (int i = 1; i <= 4; i++) {

            System.out.print(i+" ");//0 1 2 3 4

        }

        // bir for loop kullanarak 2 4 6 8 yazdırın..


        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*2+" ");

        }

        System.out.println("");
//bir for loop kullanarak 3 6 9 12 yazdırın..

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*3+" ");


        }


        // foor loop kullanarak asagıdaki sayıları yazdırın

        //1 2 3 4
        //2 4 6 8
        //3 6 9 12
        //4 8 12 16

//iç içe for dongularınde dıştaki yani ilk for loop satır ı
// iç deki yani ikinci for loop ise sutunu temsil eder
        System.out.println(" ");
        System.out.println("====================================");
        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <= 4; j++) {

                System.out.print(i*j+" ");

            }
            System.out.println("");
        }




    }
}
