package com.dam.calculatorMRJM;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorMRJMApplicationTests {
    private Calculator calculator = new Calculator();

    @Test
    void contextLoads() {
    }

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(3, 2));
    }
}
