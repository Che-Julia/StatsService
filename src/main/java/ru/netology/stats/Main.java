package ru.netology.stats;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] arr = new int[]{
                6, 18, 15, 13, 19, 22, 17, 21, 4, 14, 11, 23
        };
        int sum = service.salesAmount(arr);
        System.out.println("Сумма всех продаж = " + sum);

        double averageAmount = service.averageAmount(arr);
        System.out.println("Средняя сумма продаж = " + averageAmount);

        int maxSales = service.maxSales(arr);
        System.out.println("Номер месяца с максимальной суммой продаж " + maxSales);


        int minSales = service.minSales(arr);
        System.out.println("Номер месяца с минимальной суммой продаж " + minSales);

        int quantity = service.numberMonthsBelowAverage(arr, averageAmount);
        System.out.println("Количество месяцев c продажами ниже среднего = " + quantity);

        int quantity1 = service.numberMonthsAboveAverage(arr, averageAmount);
        System.out.println("Количество месяцев c продажами выше среднего = " + quantity1);
    }
}

