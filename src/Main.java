public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i <= 10; i ++) {
            System.out.println("Итерация цикла " + i);
        }
        // задание 4.1
        for (int i=1; i <=10; i ++) {
            System.out.println(i);
        }
        // задание 4.2
        for ( int i = 10; i > 0; i --) {
            System.out.println(i);
        }
        // задание 4.3
        for ( int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        // задание 4.4
        for ( int i = 10; i >= -10; i -- ) {
            System.out.println(i);
        }
        // задание 6.1
        for ( int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        // задание 6.2
        for ( int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // задание 6.3
        for ( int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // задание 8.1
        int vklad = 0;
        for(int i = 1; i <= 12; i++) {
            vklad = vklad + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + vklad + " рублей");
        }
        // задание 8.2
        int total = 0;
        vklad = 29000;
        for(int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total= vklad + total;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
