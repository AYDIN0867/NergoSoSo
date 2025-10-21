package D03_WrapperVeMatematiksel_Islemler;

public class C04_Pre_PostIncrement {
    public static void main(String[] args) {

        int a=20;

        //a nın degerini olusturdugunuz bir b variablesine atayın
        //sonra a yi bir arttırın;

        int b=a++;   //--, ++

        System.out.println("11. satirda a: " +a+ ", b : "+ b);//a=21,b=20
//11. satirda a: 21, b : 20

        int g=a+1;//22

        System.out.println("g : "+g);


        int c=20;

        //once c yi 1 artırın
        //sonra c nin degerini olusturdugumuz bir d variablesine atayın

        int d=++c;
        System.out.println("10. satirda c: " +c+ ", d : "+ d);//d=21,c=21
//10. satirda c: 21, d : 21






    }
}
