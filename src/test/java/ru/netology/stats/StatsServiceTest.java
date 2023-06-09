package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class stateServiceTest {
    @Test


    public void sum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 8 + 15 + 13 + 15 + 17 +  20 + 19 + 20 + 7 + 14 + 14 +  18;
        long actual = service.sum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test


    public void testaverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = (8 + 15 + 13 + 15 + 17 +  20 + 19 + 20 + 7 + 14 + 14 +  18)/12;
        double actual = service.average(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test


    public void testmaxMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        double actual = service.maxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test


    public void testminMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        double actual = service.minMonth(sales);

        Assertions.assertEquals(expected, actual);

    }
    @Test


    public void testBelowCount() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 4;
        double actual = service.belowCount(sales);

        Assertions.assertEquals(expected, actual);

    }
    @Test


    public void testAboveCount() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        double actual = service.aboveCount(sales);

        Assertions.assertEquals(expected, actual);

    }

}