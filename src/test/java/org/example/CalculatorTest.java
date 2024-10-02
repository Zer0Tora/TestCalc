package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest (name = "#{index} Сумма {0} и {1} равна {2}")
    @CsvSource({"2, 3, 5", "5, -10, -5", "0, 0, 0"})
    @DisplayName("Тест суммы двух чисел")
    @Tag("smoke")
    @Tag("smokeSumm")
    void summ(int a, int b, int resultExp) {
        Calculator calc = new Calculator();
        int resultSum = calc.summ(a, b);
        Assertions.assertEquals(resultExp, resultSum, "Ошибка сложения");
    }

    @ParameterizedTest (name = "#{index} Разность {0} и {1} равна {2}")
    @CsvSource({"7, 3, 4", "5, -10, 15", "0, 0, 0"})
    @DisplayName("Тест разности двух чисел")
    @Tag("smoke")
    @Tag("smokeDiff")
    void diff(int a, int b, int resultExp) {
        Calculator calc = new Calculator();
        int resultDiff = calc.diff(a, b);
        Assertions.assertEquals(resultExp, resultDiff, "Ошибка вычитания");
    }
}