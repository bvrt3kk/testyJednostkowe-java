import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void testSuma_JezeliLiczbyCalkowite() {
        Assertions.assertEquals(5, Kalkulator.suma(2, 3));
    }
}