import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_TwoPlusTwo_expectFour(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void add_TwoPossitiveNumbers_expectingPositiveResult() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.add(2,2)>0);
    }
}