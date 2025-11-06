package D05_IfStatements;

public class C04_TekrarIfStatements {
    public static void main(String[] args) {


        int a = 20;
        int b = 25;

        if (a > b) {

            System.out.println("a sayısı b den buyuk");
        }

        if (a < 100) {

            System.out.println("a sayısı 100 den kucuk");

        }

        if (b < 0) {

            System.out.println("b 0 dan buyuk");

        }


        //************************************Boolean şart önce de belirlenebilir


        int c=43;
        int d=45;

        boolean sonuc=c>d;

if(sonuc){

 System.out.println("c sayısı d den buyuk");

}

sonuc=d<100;

if(sonuc){

 System.out.println("d sayısı 100 den kucuk");
}

sonuc=d>0;

        if(sonuc)
        {
            System.out.println("d sayısı 100 den buyuk");

        }


  }



    }
