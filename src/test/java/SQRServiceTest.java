import org.junit.jupiter.api.Test;
import ru.natology.sqr.servicesSquare.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {


    @Test
    public void sqrMinToMaxFirst() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.total(200, 300);

        assertEquals(expected, actual);

    }

    @Test
    public void sqrMinToMaxSecond() {
        SQRService service = new SQRService();

        int expected = 13;
        int actual = service.total(100, 500);

        assertEquals(expected, actual);

    }

}

