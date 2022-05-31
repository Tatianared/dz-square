import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import ru.natology.sqr.servicesSquare.SQRService;

public class SQRServiceTest {

    @Test
    void sqrMinToMax() {
        SQRService service = new SQRService();

        int i = 15;
        int actual = service.total(225, 1);
        int expected = 1;

        Assertions.assertEquals(expected, actual);


    }


}
