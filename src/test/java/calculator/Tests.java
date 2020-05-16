package calculator;

import org.junit.*;

public class Tests {
    
    private Calculator calculator;
    
    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void test_Add() {
        int a = 22;
        int b = 16;
        int expected_value = 38;
        long result = calculator.add(a, b);
        Assert.assertEquals(expected_value, result);;
    }
    
    @Test
    public void test_Subtract() {
        int a = 22;
        int b = 16;
        int expected_value = 6;
        long result = calculator.subtract(a, b);
        Assert.assertEquals(expected_value, result);;
    }
    
    @Test
    public void test_Multiply() {
        int a = 2;
        int b = 6;
        long expected_value = 12;
        long result = calculator.multiply(a, b);
        Assert.assertEquals(expected_value, result);;
    }
    
    @Test
    public void test_Divide() {
        int a = 22;
        int b = 11;
        double expected_value = 2;
        double result = calculator.divide(a, b);
        Assert.assertEquals(expected_value, result,0.00005);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_DivideByZero() {
        int a = 22;
        int b = 0;
        calculator.divide(a, b);
    }
}