public class Main {
    public static void main(String[] args) {
        // Par 1
        System.out.println("Задание 1");
        int monthNumber = 0;
        int contribution = 15_000;
        int percent = 12;
        int total = 0;
        while (total <= 2_459_000) {
            monthNumber++;
            total += total * percent / 100 + contribution;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Потребуется " + monthNumber + " месяцев");
        System.out.println();

        // Par 2
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Par 3
        System.out.println("Задание 3");
        int birtRate = 17;
        int mortality = 8;
        int population = 12_000_000;
        for (i = 1; i <= 10; i++) {
            population += (birtRate - mortality) * population / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println();

        // Par 4
        System.out.println("Задание 4");
        total = 15_000;
        monthNumber = 0;
        percent = 7;
        while (total < 12_000_000) {
            monthNumber++;
            total += total * percent / 100;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений " + total);
        }
        System.out.println("Потребуется " + monthNumber + " месяцев");
        System.out.println();

        // Par 5
        System.out.println("Задание 5");
        total = 15_000;
        monthNumber = 0;
        percent = 7;
        while (total < 12_000_000) {
            monthNumber++;
            total += total * percent / 100;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений " + total);
            }
        }
        System.out.println("Потребуется " + monthNumber + " месяцев");
        System.out.println();

        // Par 6
        System.out.println("Задание 6");
        total = 15_000;
        percent = 7;
        int totalMonth = 9 * 12;
        monthNumber = 0;
        do {
            monthNumber++;
            total += total * percent / 100;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений " + total);
            }
        } while (monthNumber <= totalMonth);
        System.out.println();

        // Par 7
        System.out.println("Задание 7");
        int firstFriday = 6;
        int dayNumber = firstFriday;
        do {
            System.out.println("Снгодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчёт.");
            dayNumber += 7;
        } while (dayNumber <= 31);
        System.out.println();

        // Par 8
        System.out.println("Задание 8");
        int currentYear = 2024;
        int cometPeriod = 79;
        int year = currentYear - 200;
        while (year <= currentYear + 100) {
            if (year % cometPeriod == 0) {
                System.out.println(year);
            }
            year++;
        }
        System.out.println();
    }
}