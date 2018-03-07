import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {
        /*

        System.out.println("ex 2.6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько прошло секунд: ");
        int sek = scanner.nextInt();
        System.out.println();
        System.out.println("а) полных часов прошло с начала суток: " + sek / 3600);
        System.out.println();
        System.out.println("б) полных минут прошло с начала очередного часа: " + sek % 3600 / 60);
        System.out.println();
        System.out.println("в) полных секунд прошло с начала очередной минуты: " + (sek % 3600) % 60);
        System.out.println();
        */

        System.out.println("ex 2.39");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько часов: ");
        int chas = scanner.nextInt();
        System.out.println("Введитк сколько минут: ");
        int min = scanner.nextInt();
        System.out.println("Введите сколько секунд: ");
        int sec = scanner.nextInt();

        System.out.println("1) Угол положениея часовой стрелки в начале суток " + (12 - chas) * 30);
        System.out.println();
        double ygol = ((12 - chas) * 30) + (min * 0.5) + (sec * (0.5 / 60));
        System.out.println("2) Угол в указанный момент времени: " + (((12 - chas) * 30) + (min * 0.5) + (sec * (0.5 / 60))));
        System.out.println();
        System.out.println("2) Угол в указанный момент времени: " +ygol);

        int a = 10;
        int b = 16;

        if (a < b){

        }

        if (a < b){

        }else{
            //a == b && a > b
        }

        if (a < b){
            int bb;
        }else if (a > b){
            //a == b && a > b
        }else if (a == b){

        }else if (a < b) {

        }else{

        }

        System.out.println("ex 4.1");
        int x = 10;
        double y = 6;
        if (x > 0) {
            y = Math.sin(x) * Math.sin(x);
        } else {
            y = 1 - 2 * Math.sin(x * x);
        }

        System.out.println("ex 4.3");
        int x1 = 1, y1 = 2;
        if (x1 > 4) {
            y1 = 2;
        } else {
            y1 = 1;
        }
    }
}
