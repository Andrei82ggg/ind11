package com.example.ind11sp;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceParameterTest {
    CalculatorService service = new CalculatorService();
    private static List<Arguments> parameters(){
        return List.of(
                Arguments.of(1, 2),
                Arguments.of(-2d, -3d),
                Arguments.of(2d, -3d),
                Arguments.of(-2d, 3));
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void test(double num1, double num2){
    assertEquals(num1 + num2, service.plus(num1, num2));
        assertEquals(num1 - num2, service.plus(num1, num2));
        assertEquals(num1 * num2, service.plus(num1, num2));
        assertEquals(num1 / num2, service.plus(num1, num2));
    }
    @Test
    void testZeroDivide() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(10d, 0d);
    }
}
