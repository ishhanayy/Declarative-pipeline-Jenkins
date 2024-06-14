package user.training.com;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalc {
    @Test
    public void testAdd() {
        calculator myCalc = new calculator();
        int result = myCalc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        calculator myCalc = new calculator();
        int result = myCalc.subtract(5, 3);
        assertEquals(2, result);
    }
}

