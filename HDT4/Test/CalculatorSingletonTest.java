import sp.CalculatorSingleton;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorSingletonTest {

    CalculatorSingleton calc;
    public CalculatorSingletonTest() {
        calc = CalculatorSingleton.getInstance();
    }

    @org.junit.jupiter.api.Test
    void itoPCalc() {
        assertEquals("4 3 ^ 5 +",calc.ItoPCalc("4^3+5",1));
        assertEquals("7 9 * 5 -",calc.ItoPCalc("7*9-5",2));
    }

    @org.junit.jupiter.api.Test
    void calculate() {
        assertEquals(69.0,calc.calculate("4 3 ^ 5 +"));
        assertEquals(58.0,calc.calculate("7 9 * 5 -"));
    }

    @org.junit.jupiter.api.Test
    void IN() {
        assertEquals(69,calc.IN("4 3 ^ 5 +",1));
        assertEquals(-58,calc.IN("7 9 * 5 -",2));
    }
}