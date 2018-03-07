import java.util.Scanner;

public class Lesson02 {
    public static void main(String[] args) {
/*        System.out.println("ex 1.59");
        int a = 5, otvet = 10;
        int c = a;
        a = otvet;
        otvet = c;
        System.out.println("a = " +a);
        System.out.println("b = " +otvet);
        System.out.println();

        System.out.println("ex 2.5");
        a = 234;
        otvet = a / 7;
        System.out.println("b = " +otvet);
        System.out.println();

        // Scanner x = new Scanner(System.in);
        // System.out.println("Введите число: ");
        // String x1 = x.nextLine();

        System.out.println("ex 2.8");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой день в году: ");
        int numOfDayInYear = 13;//scanner.nextInt();
        System.out.println("введите какой день недели 1 января: ");
        int denNedeli = 1;//scanner.nextInt();
        otvet = numOfDayInYear % 7 + denNedeli - 1;

        System.out.println("День недели: " +otvet);

        System.out.println("ex 2.10");
        System.out.println("Введите число: ");
        int chislo = scanner.nextInt();
        int desyatki = chislo / 10;
        int edenici = chislo % 10;
        int summ = desyatki + edenici;
        int proizv = desyatki * edenici;
        System.out.println("десятков: " +desyatki);
        System.out.println("единиц: " +edenici);
        System.out.println("сумма: " +summ);
        System.out.println("произведение: " +proizv);
*/
        System.out.println("ex 2.12");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int chislo = scan.nextInt();
        int sotni = chislo / 100;
        int ostsotni = chislo % 100;
        int desyatki = ostsotni / 10;
        int edenici = chislo % 10;
        int summ = desyatki + edenici + sotni;
        int proizv = desyatki * edenici * sotni;
        System.out.println("единиц: " +edenici);
        System.out.println("десятков: " +desyatki);
        System.out.println("сумма: " +summ);
        System.out.println("произведение: " +proizv);
    }
}
