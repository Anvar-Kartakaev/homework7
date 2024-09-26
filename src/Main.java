public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №7\n");

        //Task 1
        System.out.println("Задание №1:");
        int plusMoneyBank = 15000;
        int totalMoneyBank = 0;
        int months = 0;
        while (totalMoneyBank <= 2_459_000) {
            totalMoneyBank += plusMoneyBank; //Ежемесячно вкладываем 15 000 рублей
            totalMoneyBank = (totalMoneyBank * 110) / 100; //Процент накопления 10% в месяц на остаток
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalMoneyBank + " рублей");
        }


        //Task 2
        System.out.println("\nЗадание №2:");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }


        //Task 3
        System.out.println("\n\nЗадание №3:");
        int countryY = 12000000;
        int birthRate = 17 * (countryY / 1000);
        int deathRate = 8 * (countryY / 1000);
        int year = 2000;
        while (year < 2010) {
            countryY = (countryY + birthRate) - deathRate;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
        }


        //Task 4
        System.out.println("\nЗадание №4:");
        int contribution = 15000; // В задаче не сказано, что он каждый месяц будет пополнять счет
        int newMonth = 1;
        while (contribution < 12_000_000) {
            contribution = (contribution * 107) / 100; // Поэтому считаем ежемесячные накопления от процентов
            System.out.println("Месяц " + newMonth + ", численность накоплений составляет " + contribution + " рублей");
            newMonth++;
        }


        //Task 5
        System.out.println("\nЗадание №5:");
        int newContribution = 15000; // В задаче не сказано, что он каждый месяц будет пополнять счет
        int newMonth2 = 1;
        while (newContribution < 12_000_000) {
            newContribution = (newContribution * 107) / 100; // Поэтому считаем ежемесячные накопления от процентов
            if (newMonth2 % 6 == 0) {
                System.out.println("Месяц " + newMonth2 + ", численность накоплений составляет " + newContribution + " рублей");
            }
            newMonth2++;
        }


        //Task 6
        System.out.println("\nЗадание №6:");
        int finishYear = 108; // Сразу перевожу 9 лет в месяцы (9*12)
        int contribution2 = 15000;
        int newMonth3 = 1;
        do {
            contribution2 = (contribution2 * 107) / 100;
            newMonth3++;
            if (newMonth3 % 6 == 0) {
                System.out.println("Месяц " + newMonth3 + ", численность накоплений составляет " + contribution2 + " рублей");
            }
        } while (newMonth3 <= finishYear);


        //Task 7
        System.out.println("\nЗадание №7:");
        int friday = 6; // Взял текущий месяц Сентябрь 2024, пятница выпадает на 6 число
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        } while (friday < 31);


        //Task 8
        System.out.println("\nЗадание №8:");
        //Первый вариант решения задачи
        System.out.println("Первый вариант решения задачи");
        int yearZero = 0;
        int thisYear = 2024;
        do {
            yearZero = yearZero + 79;
            if (yearZero > thisYear - 200 && yearZero < thisYear + 100) {
                System.out.println(yearZero);
            }
        }
        while (yearZero <= thisYear + 100);

        //Второй вариант решения задачи
        System.out.println("Второй вариант решения задачи");
        int oldYears = 2024 - 200;
        int nextYears = 2024 + 100;
        for (yearZero = oldYears; yearZero < nextYears; yearZero ++) {
            if (yearZero % 79 == 0){
                System.out.println(yearZero);}
        }
        // Не смог определиться какой вариант решения лучше


    }
}