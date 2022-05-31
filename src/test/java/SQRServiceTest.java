import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import ru.natology.sqr.servicesSquare.SQRService;

public class SQRServiceTest {

    @Test
    public void sqrMinToMaxFirst() {
        SQRService service = new SQRService();

        int i = 15;
        int expected = 1;
        int actual = service.total(1);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sqrMinToMaxSecond() {
        SQRService service = new SQRService();

        int i = 16;
        int expected = 2;
        int actual = service.total(2);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sqrLessMinToMax() {
        SQRService service = new SQRService();

        int i = 10;
        int expected = 0;
        int actual = service.total(0);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sqrMoreMinToMax() {
        SQRService service = new SQRService();

        int i = 99;
        int expected = 3;
        int actual = service.total(3);

        Assertions.assertEquals(expected, actual);

    }
}

