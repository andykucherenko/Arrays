package ru.netology.stats;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAvgSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAvgSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSumMaxMonth() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.sumMaxMonth(maxMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSumMinMonth() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.sumMinMonth(minMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountMonthUnderAvg() {
        StatsService service = new StatsService();
        int[] amountMonthUnderAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.amountMonthUnderAvg(amountMonthUnderAvg);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldamountMonthOverAvg() {
        StatsService service = new StatsService();
        int[] amountMonthOverAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.amountMonthOverAvg(amountMonthOverAvg);

        Assertions.assertEquals(expected, actual);
    }
}
