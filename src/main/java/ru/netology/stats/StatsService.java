package ru.netology.stats;

public class StatsService {
    // Вычисляем  сумму продаж в месяц
    public long sum(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    // Вычисляем среднюю сумму продаж в месяц
    public double average(long[] sales) {
        return sum(sales) / sales.length;

    }

    // Находим месяц с максимальными продажами
    public long maxMonth(long[] sales) {

        long maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i+1;
            }

        }
        return maxMonth;
    }

    // Находим месяц с минимальными продажами
    public long minMonth(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i+1;
            }
        }
        return minMonth;
    }

    // Считаем количество месяцев с продажами ниже среднего
    public long belowCount(long[] sales) {
        int belowCount = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < average(sales)) {
                belowCount++;
            }
        }
        return belowCount;
    }

    // Считаем количество месяцев с продажами выше среднего
    public long aboveCount(long[] sales) {
        int aboveCount = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > average(sales)) {
                aboveCount++;
            }
        }
        return aboveCount;
    }
}
// Выводим результаты
 //       System.out.println("Сумма всех продаж равна " + sum);
 //       System.out.println("Средняя сумма продаж в месяц равна " + average);
 //       System.out.println("Месяц с максимальными продажами - это " + (maxMonth + 1));
//        System.out.println("Месяц с минимальными продажами - это " + (minMonth + 1));
//        System.out.println("Количество месяцев с продажами ниже среднего - это " + belowCount);
//        System.out.println("Количество месяцев с продажами выше среднего - это " + aboveCount);






