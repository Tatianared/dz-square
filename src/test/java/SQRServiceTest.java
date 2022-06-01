import org.testng.annotations.Test;
import ru.natology.sqr.servicesSquare.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {


    @Test
    public void sqrMinToMaxFirst() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.total(200, 300, 289, 3);

        assertEquals(expected, actual);

    }


    @Test
    public void sqrMoreMinToMax() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.total(200, 300, 9801, 3);

        assertEquals(expected, actual);

    }
}

