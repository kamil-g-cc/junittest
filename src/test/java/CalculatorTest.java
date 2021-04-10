import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculatorTest {
    private Calculator calculator;

    private static Stream<Arguments> positiveNumbers(){
        return Stream.of(
                arguments(2, 2),
                arguments(1, 3),
                arguments(6, 7),
                arguments(1, 9)
        );
    }
    @AfterAll
    static void end(){
        System.out.println("Finished testing Calculator!");
    }

    @BeforeAll
    static void start(){
        System.out.println("Starting Calculator testing...");
    }


    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -3, -1, -4})
    void isNegative_NegativeNumbers_expectingTrue(int a){
        assertTrue(calculator.isNegative(a));
    }

    @ParameterizedTest
    @MethodSource("positiveNumbers")
    void add_SumPositiveNumbers_expectingPositiveResult(int a, int b){
        assertTrue(calculator.add(a, b) > 0);
    }
    @Test
    void add_TwoPlusTwo_expectFour(){
        //Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void add_TwoPossitiveNumbers_expectingPositiveResult() {
        //Calculator calculator = new Calculator();
        assertTrue(calculator.add(2,2)>0);
    }

    @Test
    void divide_DevideByZero_expectingInfinity(){
        //Calculator calculator = new Calculator();
        assertTrue(Double.isInfinite(calculator.divide(2, 0)));

    }
    @Test
    void divideUnsupportingInfinity_DevideByZero_expectingException() {
        //Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divideUnsupportingInfinity(2, 0);
        });
    }
}