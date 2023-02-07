package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] amount) {

        int sum = 0;
        for (int i = 0; i < amount.length; i++) {
            sum += amount[i];
        }
        return sum;
    }

    public double averageAmount(int[] amount) {
        double average = 0;
        if (amount.length > 0) {
            double sum = 0;
            for (int i = 0; i < amount.length; i++) {
                sum += amount[i];
            }
            average = sum / amount.length;
        }
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int numberMonthsBelowAverage(int[] number) {
        int quantity = 0;
        for (int sale : number)
            if (sale < averageAmount(number)) {
                quantity++;
            }
        return quantity;
    }


    public int numberMonthsAboveAverage(int[] number) {
        int quantity = 0;
        for (int sale : number)
            if (sale > averageAmount(number)) {
                quantity++;
            }
        return quantity;
    }
}


