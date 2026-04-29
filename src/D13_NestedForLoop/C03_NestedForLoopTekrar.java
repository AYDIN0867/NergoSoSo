package D13_NestedForLoop;

public class C03_NestedForLoopTekrar {
    public static void main(String[] args) {

        /*

        * 1.1
        * *  2.1 2.2
        * * * 3.1 3.2 3.3
        * * * * 4.1 4.2 4.3 4.4

         */

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }

    }
}
