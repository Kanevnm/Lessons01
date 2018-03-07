import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigDecimal;

public class Lesson01 {

    public static void main(String[] args){
        int a = 2_000_000_000;
        {
            {
                int y=0;
            }
            long y=9;
        }
        byte bt = -128;
        short sh = 3670;
        long lg = 15_000_000_000_000_000_00L;
        float fl = 3.3f;
        double db = 9.0;

        char ch ='a';
        boolean bl = true;
        bl = 5>7;

        short s =(short) bt;
        bt =(byte) sh;

        System.out.println(bt);
        System.out.println(sh);

        BigDecimal bg = new BigDecimal(1.89);
        System.out.println(1+1);
        System.out.println("1"+1+1);
        System.out.println(1+1+"1");
        System.out.println("ex 1.1");
        double pi = 3.14;
        System.out.println("pi = " + pi);

        System.out.println("ex 1.5");
        System.out.println("1 13 49");

        System.out.print("1 ");
        System.out.print("13 ");
        System.out.print("49 ");

        String str = "1 13 49";
        System.out.println(str);

        int i1= 1, i2 = 13, i3 = 39;
        System.out.println(i1+" "+i2+" "+i3);

        System.out.println("ex 1.12");
        System.out.println("a)");
        System.out.println("5 10");
        System.out.println("7 см");

        System.out.println("b)");
        int t = 33, v = 11;
        System.out.println("100 " + t);
        System.out.println("1949 " +v);

        System.out.println("c)");
        int x = 11, y = 10;
        System.out.println(x + " 25");
        System.out.println(x +  " " + y);

        System.out.println("ex 1.14");
        System.out.println("a)");
        double y1 = 2*x;
        System.out.println("b)");
        double x1 = Math.sin(x);
        System.out.println("в)");
        a = 2;
        double a1 = a*a;
        System.out.println("г)");
        double x2 = 10;
        double x3 = Math.sqrt(x2);

        System.out.println("д)");
        double n1 = -10;
        double n2 = Math.abs(n1);
        System.out.println(n2);

        System.out.println("е)");
        double y3 = 10;
        double y4 = Math.cos(y3);
        System.out.println(5 * y4);

        System.out.println("ж)");
        a1 = 2;
        double a2 = a1 * a1;
        System.out.println(-7.5 * a2);

        System.out.println("з) ");
        double x5 = 10;
        double x6 = 3 * Math.sqrt(x5);
        System.out.println("x6 =" + x6);

        System.out.println("и) ");
        double a5 = 3, b5 = 2;
        double i = Math.sin(a5) * Math.cos(b5) + Math.cos(a5) * Math.sin(b5);
        System.out.println("i= " + i);

        System.out.println("к) ");
        double a6 = 6, b6 = 6;
        double k = a6 * Math.sqrt(2 * b6);
        System.out.println("k= " + k);

        System.out.println("л) ");
        double a7 = 7, b7 = 33;
        double l = 3 * Math.sin(2 * a7) * Math.cos(3 * b7);
        System.out.println("l=" + l);

        System.out.println("м) ");
        double x8 = 8, y8 = 1;
        double m = -5 * Math.sqrt(x8 + Math.sqrt(y8));
        System.out.println("m= " + m);




    }
}
