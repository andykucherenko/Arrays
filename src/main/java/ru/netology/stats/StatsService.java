package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAvgSum(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int sumMaxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int sumMinMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int amountMonthUnderAvg(int[] sales) {
        int count = 0;
        int salesAvg = calculateAvgSum(sales);
        for (int sale : sales) {
            if (sale < salesAvg) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthOverAvg(int[] sales) {
        int count = 0;
        int salesAvg = calculateAvgSum(sales);
        for (int sale : sales) {
            if (sale > salesAvg) {
                count++;
            }
        }
        return count;
    }
}
