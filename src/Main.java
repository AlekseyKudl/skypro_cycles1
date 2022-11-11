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

        //урок 2 Задание 1
        total = 0;
        vklad = 15000;
        int i = 0;
        while(total <=  2_459_000) {
            total = total + total / 100;
            total= vklad + total;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // задание 2
        i = 1;
        while (i <= 10) {
            System.out.print(i++ +" ");
        }
        i = 10;
        System.out.println();
        for (;i > 0;) {
            System.out.print(i-- +" ");
        }
        // задание 3
        System.out.println();
        int y = 12_000_000;
        int bornPerTh = 17;
        int diePerTh = 8;
        i = 1;
        while (i <= 10) {
            y = y + y / 1000 * bornPerTh - y / 1000 * diePerTh;
            System.out.println("Год " + i++ +", численность населения составляет " + y);

        }
        // Д/з 2 задание 1
        int depositVasiliy = 15_000;
        int percent = 7;
        int month = 1;
        while (depositVasiliy <= 12_000_000) {
            depositVasiliy = depositVasiliy + depositVasiliy / 100 * percent;
            System.out.println("Месяц " + month++ + " сумма накоплений " + depositVasiliy);
        }
        // задание 2
        System.out.println();
        depositVasiliy = 15_000;
        percent = 7;
        month = 1;
        while (depositVasiliy <= 12_000_000) {
            depositVasiliy = depositVasiliy + depositVasiliy / 100 * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + depositVasiliy);
            }
            month++;
        }
        // задание 3
        System.out.println();
        depositVasiliy = 15_000;
        percent = 7;
        month = 1;
        while (month <= 108) {
            depositVasiliy = depositVasiliy + depositVasiliy / 100 * percent;
            if (month % 6 == 0) {
                System.out.println("Полугодие " + month / 6 + " сумма накоплений " + depositVasiliy);
            }
            month++;
        }

        // задание 3
        int firstDateFriday = 4;
        while (firstDateFriday <=31) {
            System.out.println("Сегодня пятница, " + firstDateFriday + "-е число. Необходимо подготовить отчет.");
            firstDateFriday = firstDateFriday + 7;
        }

        // Д/з 3 задание 1
        int yearOfCometa = 1;
        int yearsBefore = 200;
        int yearsAfter = 100;
        int yearNow = 2022;
        yearOfCometa = yearNow - yearsBefore;
        int stop = yearNow + yearsAfter;
        while (yearOfCometa <= 2122) {
            if (yearOfCometa % 79 == 0) {
                System.out.println(yearOfCometa);
            }
            yearOfCometa++;
        }

        // Д/з 3 задание 2
        int x = 1;
        y = 2;
        for (; x <= 10; x++) {
            System.out.println(y + "*" + x + " = " + y * x);
        }

    }
}
