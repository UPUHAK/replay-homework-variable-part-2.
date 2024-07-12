public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");
        int i = 2056754;
        byte b = 15;
        short sh = 13056;
        long l = 3000000L;
        float f = 15.000006f;
        double d = 7.000000009;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной sh с типом short равно " + sh);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        System.out.println("Задача 2");
        float one = 27.12f;
        long two = 987678965549L;
        float three = 2.786f;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
        System.out.println("Итак, у нас есть значения: " + one + " " + two + " " + three + " " + four + " " + five + " " + six + " " + seven);

        System.out.println("Задача 3");
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int studentsNumber = class1 + class2 + class3;
        int totalPaper = 480;
        System.out.println("На каждого ученика рассчитано " + totalPaper/studentsNumber + " листов бумаги");

        System.out.println("Задача 4");
        int productivity2min = 16;
        int productivity1min = productivity2min / 2;
        int productivity1day = productivity1min * 60 * 24;
        int minutesNumber = 20;
        System.out.println("За " + minutesNumber + " минут машина произвела " + (productivity1min * minutesNumber) + " штук бутылок");
        int daysNumder = 1;
        System.out.println("За " + daysNumder + " дней машина произвела " + (productivity1day * daysNumder) + " штук бутылок");
        daysNumder = 3;
        System.out.println("За " + daysNumder + " дней машина произвела " + (productivity1day * daysNumder) + " штук бутылок");
        daysNumder = 30;
        System.out.println("За " + daysNumder + " дней машина произвела " + (productivity1day * daysNumder) + " штук бутылок");

        System.out.println("Задача 5");
        int totalPaint = 120;
        int whitePaintOneClassroom = 2;
        int brownPaintOneClassroom = 4;
        int ClassroomsNumber = totalPaint / (whitePaintOneClassroom + brownPaintOneClassroom);
        System.out.println("В школе, где " + ClassroomsNumber + " классов, нужно " + (whitePaintOneClassroom * ClassroomsNumber) + " банок белой краски и " + (brownPaintOneClassroom * ClassroomsNumber) + " банок коричневой краски");

        System.out.println("Задача 6");
        int banana = 80;
        int milkVolume = 200;
        int milkWeight = milkVolume / 100 * 105;
        int iceCream = 100;
        int egg = 70;
        int breakfastWeight = (banana * 5) + milkWeight + (iceCream * 2) + (egg * 4);
        System.out.println("Вес завтрака в граммах составляет " + breakfastWeight);
        System.out.println("Вес завтрака в килограммах составляет " + ( (float) breakfastWeight / 1000));

        System.out.println("Задача 7");
        int totalWeightLoss = 7000;
        int dailyWeightLoss1 = 250;
        int dailyWeightLoss2 = 500;
        int daysNumber1 = totalWeightLoss / dailyWeightLoss1;
        int daysNumber2 = totalWeightLoss / dailyWeightLoss2;
        int averageDaysNumber = (daysNumber1 + daysNumber2) / 2;
        System.out.println("Если ежедневно снижать вес на " + dailyWeightLoss1 + " грамм, то потребуется " + daysNumber1 + " дней.");
        System.out.println("Если ежедневно снижать вес на " + dailyWeightLoss2 + " грамм, то потребуется " + daysNumber2 + " дней.");
        System.out.println("В среднем потребуется " + averageDaysNumber + " дней.");

        System.out.println("Задача 8");
        int salaryMasha2023 = 67760;
        int salaryDenis2023 = 83690;
        int salaryChristina2023 = 76230;
        int salaryMasha2024 = (int) (salaryMasha2023 * 1.1);
        int salaryDenis2024 = (int) (salaryDenis2023 * 1.1);
        int salaryChristina2024 = (int) (salaryChristina2023 * 1.1);
        System.out.println("Маша теперь получает " + salaryMasha2024 + " рублей. Годовой доход вырос на " + ((salaryMasha2024 * 12) - (salaryMasha2023 * 12)) + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis2024 + " рублей. Годовой доход вырос на " + ((salaryDenis2024 * 12) - (salaryDenis2023 * 12)) + " рублей");
        System.out.println("Кристина теперь получает " + salaryChristina2024 + " рублей. Годовой доход вырос на " + ((salaryChristina2024 * 12) - (salaryChristina2023 * 12)) + " рублей");
    }
}