package com.example.ind11sp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService service = new CalculatorService();

    @Test
    void testPlus() {
        var actual = service.plus(1d, 2d);
        assertEquals(3d, actual);

        var actual2 = service.plus( 3d, -2d);
        assertEquals(1d, actual2);
    }

    @Test
    void testMinus() {
        var actual = service.minus(3d, 2d);
        assertEquals(1d, actual);

        var actual2 = service.minus( -1d, -2d);
        assertEquals(1d, actual2);
    }

    @Test
    void testMultiply() {
        var actual = service.multiply(2d, 2d);
        assertEquals(4d, actual);

        var actual2 = service.multiply( -1d, -2d);
        assertEquals(3d, actual2);
    }

    @Test
    void testDivide() {
        var actual = service.divide(2d, 2d);
        assertEquals(1d, actual);

        var actual2 = service.divide( -10d, -2d);
        Assertions.assertEquals(5d, actual2);
    assertThrows(IllegalArgumentException.class, () -> service.divide(10d, 0d);
    }
}