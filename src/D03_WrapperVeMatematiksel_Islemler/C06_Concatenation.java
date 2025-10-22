package D03_WrapperVeMatematiksel_Islemler;

import javax.swing.*;

public class C06_Concatenation {
    public static void main(String[] args) {


        //src/Pages/{D533A1CA-2CE1-430A-9046-E141E50DF124}.png
//        ImageIcon icon = new ImageIcon("src/Pages/{D533A1CA-2CE1-430A-9046-E141E50DF124}.png");
//        JLabel label = new JLabel(icon);
//        JFrame frame = new JFrame();
//        frame.add(label);
//        frame.pack();
//        frame.setVisible(true);
//Sadece verilen variable’lari kullanarak istenen String’leri elde edelim.
                String s1="Java";       //12 Java kolay
                String s2=" ";          //7 Java kolay
                String s3="kolay";      //34Java kolay
                String s4="";           //Java12kolay
                                       //Java34kolay

                int a=3;
                int b=4;
                int c=a*b;
                int d=a+b;
        System.out.println(c+s2+s1+s2+s3);//12 Java kolay
        System.out.println(d+s2+s1+s2+s3);//7 Java kolay
        System.out.println(a+s4+b+s1+s2+s3);//34Java kolay
        System.out.println(s1+c+s3);//Java12kolay
        System.out.println(s1+a+s4+b+s3);//Java34kolay
        System.out.println(s1+d+s3);//Java7kolay



    }

}
