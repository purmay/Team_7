import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
        calc.setNumbers(4, 2);
    }

    @Test
    void testAdd() {
        assertEquals(6, calc.add());
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.subtract());
    }

    @Test
    void testMultiply() {
        assertEquals(8, calc.multiply());
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide());
    }
}