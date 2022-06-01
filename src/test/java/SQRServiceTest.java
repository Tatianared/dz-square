import org.testng.annotations.Test;
import ru.natology.sqr.servicesSquare.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    public void sqrLessMinToMax() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.total(10, 0);

        assertEquals(expected, actual);

    }

    @Test
    public void sqrMinToMaxFirst() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.total(15, 1);

        assertEquals(expected, actual);

    }

    @Test
    public void sqrMinToMaxSecond() {
        SQRService service = new SQRService();

        int expected = 2;
        int actual = service.total(16, 2);

        assertEquals(expected, actual);

    }


    @Test
    public void sqrMoreMinToMax() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.total(99,3 );

        assertEquals(expected, actual);

    }
}

