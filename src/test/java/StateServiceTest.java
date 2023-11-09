import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.StatsService;

public class StateServiceTest {

    @Test
    public void shouldCalculateForSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getSumSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateForFindAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.findAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateForMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.getMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.findBelowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAboveAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.findAboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
