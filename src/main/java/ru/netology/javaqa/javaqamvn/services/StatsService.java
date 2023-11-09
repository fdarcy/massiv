package ru.netology.javaqa.javaqamvn.services;

public class StatsService {
    public int getSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return getSumSales(sales) / sales.length;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {

                maxMonth = month;
            }

            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {

                minMonth = month;
            }

            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findBelowAverageSales(int[] sales) {
        int minMonth = 0;
        for (int sale : sales) {
            if (sale < findAverage(sales)) {
                minMonth = minMonth + 1;
            }
            minMonth = minMonth;
        }
        return minMonth;


    }

    public int findAboveAverageSales(int[] sales) {
        int maxMonth = 0;
        for (int sale : sales) {
            if (sale > findAverage(sales)) {
                maxMonth = maxMonth + 1;
            }
            maxMonth = maxMonth;
        }
        return maxMonth;

    }
}
