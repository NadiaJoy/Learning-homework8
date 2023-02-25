package org.example;
import org.junit.*;
import static jdk.nashorn.internal.objects.Global.Infinity;

//ex.1
public class CalcTest {

    Calculator calculator;

    @Before
    public void setUpEveryTest() {
        calculator = new Calculator();
    }

    @Test
    public void multPositiveNumbers() {
        double result = calculator.multiplication(2.2, 3.3);
        Assert.assertEquals(7.26, result, 0.001);
    }

    @Test
    public void multNegariveNumbers() {
        double result = calculator.multiplication(-2.201, -3.305);
        Assert.assertEquals(7.274, result, 0.001);
    }

    @Test
    public void multPositiveNegativeNumbers() {
        double result = calculator.multiplication(-1.4, 2);
        Assert.assertEquals(-2.8, result, 0.001);
    }

    @Test
    public void multZero() {
        double result = calculator.multiplication(0, 3.3);
        Assert.assertEquals(0, result, 0.001);
    }

    @Test
    public void divPositiveNumbers() {
        double result = calculator.division(4.9, 1.5);
        Assert.assertEquals(3.267, result, 0.001);
    }

    @Test
    public void divNegativeNumbers() {
        double result = calculator.division(-4.9, -1.5);
        Assert.assertEquals(3.267, result, 0.001);
    }
    @Test
    public void divZeroDividend() {
        double result = calculator.division(0, -2.5);
        Assert.assertEquals(0, result, 0.001);
    }
    @Test
    public void divZeroDivision() {
        double result = calculator.division(4.0, 0);
        Assert.assertEquals(Infinity, result, 0.001);
    }
}
