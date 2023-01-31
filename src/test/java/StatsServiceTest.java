import netolgy.ru.stats.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void allSalesSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void avgSaleOnMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvg = 15;
        int actualAvg = service.avgSaleOnMonth(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);

    }

    @Test
    public void maxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);

    }

    @Test
    public void minMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 9;
        int actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);

    }

    @Test
    public void lessThanAvgMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actualLess = service.monthLessAvg(sales);

        Assertions.assertEquals(expected, actualLess);


    }

    @Test
    public void moreThanAvgMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actualMore = service.monthMoreAvg(sales);

        Assertions.assertEquals(expected, actualMore);


    }


}
