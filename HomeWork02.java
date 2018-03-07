import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args){
        System.out.println("ex 2.6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько прошло Секунд с начала суток: ");
        double sec = scanner.nextDouble();
        double min = sec / 60;
        double chas = min / 60;
        double polnchas = Math.floor(min / 60);
        double polnmin = Math.floor(min % 60);
        double polnsec = Math.floor(sec % 60);
/*
        15698 сек
                15698 / 3600 = 4
                        15698 - (3600 * 4) = 15698 % 3600 = 1298
                                1298 / 60 = 21
*/
        System.out.println("Введите сколько прошло Секунд с начала суток: ");
        int sec1 = scanner.nextInt();

        // System.out.println("секунд " +sec);
        // System.out.println("минут " +min);
        // System.out.println("часов " +chas);

        System.out.println("а) полных часов с начала суток: " +polnchas);
        System.out.println();
        System.out.println("б) полных минут с начала очередного часа: " +polnmin);
        System.out.println();
        System.out.println("в) полных секунд прошло с начала очередной минуты: " + polnsec);

        /*
        int chas = sec / 60 / 60;
        System.out.println("а) полных часов прошло с начала суток: " +chas);
        System.out.println();
        int minSChasa = sec % 60;
        System.out.println("б) полных минут с начала очередного часа: " +minSChasa);
        System.out.println(); */

        System.out.println("ex 2.9");
        System.out.println("Введите сколько месяцев прошло: ");
        int mes = scanner.nextInt() % 12 + 1;
        System.out.println("Месяц: " +mes);

        System.out.println("ex 2.39");
        System.out.println("Введите сколько часов: ");
        int chas1 = scanner.nextInt();
        System.out.println("Введитк сколько минут: ");
        int mint = scanner.nextInt();
        System.out.println("Введите сколько секунд: ");
        int sect = scanner.nextInt();

        System.out.println("Угол положениея часовой стрелки в начале суток " + (12 - chas1) * 30);
        System.out.println();
    }
}
