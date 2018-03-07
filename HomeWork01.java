import java.util.Scanner;
public class HomeWork01 {
    public static void main(String[] args) {
        {
            System.out.println("ex 1.1");
            System.out.println("п = 3,14");
            System.out.println();
        } {
            System.out.println("ex 1.2");
            System.out.println("e = 2,71828");
            System.out.println();
        } {
            System.out.println("ex 1.3");
            Scanner x = new Scanner(System.in);
            System.out.println("Введите число: ");
            String x1 = x.nextLine();
            System.out.println("Вы ввели: " + x1);
            System.out.println();
        } {
            System.out.println("ex 1.4");
            Scanner x = new Scanner(System.in);
            System.out.println("Введите число: ");
            String x1 = x.nextLine();
            System.out.println(x1 + " - вот такое число Вы ввели");
            System.out.println();
        } {
            System.out.println("ex 1.5");
            System.out.println("1 13 49");
            System.out.println();
        } {
            System.out.println("ex 1.6");
            System.out.println("7  15  100");
            System.out.println();
        } {
            System.out.println("ex 1.7");
            System.out.println("321  233  213");
            System.out.println();
        } {
            System.out.println("ex 1.8");
            System.out.println("1 2 3 4");
            System.out.println();
        } {
            System.out.println("ex 1.9");
            System.out.println("50");
            System.out.println("10");
            System.out.println();
        } {
            System.out.println("ex 1.10");
            System.out.println("5");
            System.out.println("10");
            System.out.println("21");
            System.out.println();
        } {
            System.out.println("ex 1.11");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println();
        } /* {
		        System.out.println("1.12");
		        Scanner scanner = new Scanner (System.in);
		        System.out.println("Введите число t: ");
		        int t = scanner.nextInt();
		        System.out.println("Введите число v: ");
		        int v = scanner.nextInt();
		        System.out.println("Введите число x: ");
		        int x = scanner.nextInt();
		        System.out.println("Введите число y: ");
		        int y = scanner.nextInt();
		        System.out.println("a) 5 10");
		        System.out.println("   7 см");
		        System.out.println();
		        System.out.println("б) 100 " + t);
		        System.out.println("   1949 " + v);
		        System.out.println();
		        System.out.println("в)  " + x + " " + "25");
		        System.out.println("    " + x + " " + y);
		        System.out.println();
		    }  {
		        System.out.println("1.13");
		        Scanner scan = new Scanner(System.in);
		        // a b x y
		        System.out.println("Введите a: ");
		        int a = scan.nextInt();
		        System.out.println("Введите b: ");
		        int b = scan.nextInt();
		        System.out.println("Введите x: ");
		        int x = scan.nextInt();
		        System.out.println("Введите y: ");
		        int y = scan.nextInt();
		        System.out.println();
		        System.out.println("а) 2 кг");
		        System.out.println("   13 17");
		        System.out.println();
		        System.out.println("б) " + a + " 1");
		        System.out.println("   19 " + b);
		        System.out.println();
		        System.out.println("в) " + x + " " + y);
		        System.out.println("   5 " + y);
		    } */
        {
            System.out.println("ex 1.14");
            int x = 1, y = 2, n = -10, b = 1, a = 2;
            System.out.print("a) ");
            System.out.println(2 * x);
            System.out.println();
            System.out.print("б) ");
            System.out.println(Math.sin(x));
            System.out.println();
            System.out.println("в) ");
            System.out.println(Math.pow(a, 2));
            System.out.println();
            System.out.println("г) ");
            System.out.println(Math.sqrt(x));
            System.out.println();
            System.out.println("д) ");
            System.out.println(Math.abs(n));
            System.out.println();
            System.out.println("е) ");
            System.out.println(5 * Math.cos(y));
            System.out.println();
            System.out.println("ж) ");
            System.out.println(-7.5 * Math.pow(a, 2));
            System.out.println();
            System.out.println("3) ");
            System.out.println(3 * Math.sqrt(x));
            System.out.println();
            System.out.println("и) ");
            System.out.println(Math.sin(a) * Math.cos(b) + Math.cos(a) * Math.sin(b));
            System.out.println();
            System.out.println("к) ");
            System.out.println(a * Math.sqrt(2 * b));
            System.out.println();
            System.out.println("л) ");
            System.out.println(3 * Math.sin(2 * a) * Math.cos(3 * b));
            System.out.println();
            System.out.println("м) ");
            System.out.println(-5 * Math.sqrt(x + Math.sqrt(y)));
            System.out.println();
        } {
            System.out.println("ex 1.15");
            double x = 1, a = 1, b = 4, c = 2, m = 2, n = 2;
            System.out.println("а) ");
            System.out.println(-1 / (Math.pow(x, 2)));
            System.out.println();
            System.out.println("б) ");
            System.out.println(a / b * c);
            System.out.println();
            System.out.println("в) ");
            System.out.println((a / b) * c);
            System.out.println();
            System.out.println("г) ");
            System.out.println((a + b) / 2);
            System.out.println();
            System.out.println("д) ");
            System.out.println(5.45 * ((a + 2 * b) / (2 - a)));
            System.out.println();
            System.out.println("е) ");
            System.out.println((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a)));
            System.out.println();
            System.out.println("ж) ");
            System.out.println((-b + (1 / a)) / (2 / c));
            System.out.println();
            System.out.println("з) ");
            System.out.println(1 / (1 + ((a + b) / 2)));
            System.out.println();
            System.out.println("и) ");
            System.out.println(1 / (1 + 1 / (2 + 1 / (2 + 3 / 5))));
            System.out.println();
            System.out.println("к) ");
            System.out.println(Math.pow(2, Math.pow(m, n)));
            System.out.println();
        } {

        }
    }
}