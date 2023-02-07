import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void salesAmount() {
        StatsService service = new StatsService();
        int[] amount = {6, 18, 15, 13, 19, 22, 17, 21, 4, 14, 11, 23};

        int expectedSum = 183;
        int actualSum = service.salesAmount(amount);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();
        int[] amount = {6, 18, 15, 13, 19, 22, 17, 21, 4, 14, 11, 23};

        double expectedSum = 15.25;
        double actualSum = service.averageAmount(amount);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int[] amount = {6, 18, 15, 13, 19, 22, 17, 21, 4, 14, 11, 23};

        int expectedMonth = 12;
        int actualMonth = service.maxSales(amount);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int[] amount = {6, 18, 15, 13, 19, 22, 17, 21, 4, 14, 11, 23};

        int expectedMonth = 9;
        int actualMonth = service.minSales(amount);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void numberMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] number = {6, 18, 15, 13, 19, 22, 17, 21, 4, 14, 11, 23};

        int expectedBelowAverage = 6;
        int actualBelowAverage = service.numberMonthsBelowAverage(number);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void numberMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] number = {6, 18, 15, 13, 19, 22, 17, 21, 4, 14, 11, 23};

        int expectedAboveAverage = 6;
        int actualAboveAverage = service.numberMonthsAboveAverage(number);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}
