package lesson21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

   private Calculator calculator;

   @BeforeEach
   public void init() {
       calculator = new Calculator();
   }
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(2, 2));
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.sub(8, 4));
    }
    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(10, calculator.mul(2, 5));
    }
    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2, calculator.div(10, 5));
    }
}
