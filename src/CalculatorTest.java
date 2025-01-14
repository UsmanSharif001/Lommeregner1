import org.junit.Assert;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void addNumbersToCalculation() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.add(first,second);
        Assert.assertEquals(3.0, result, 0.1);
    }


    @org.junit.jupiter.api.Test
    void subtractNumbersFromCalculation() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.subtract(first,second);
        Assert.assertEquals(-1.0, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void multiplyNumbers() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.multiply(first,second);
        Assert.assertEquals(2.0, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void divideNumbers() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.divide(first,second);
        Assert.assertEquals(0.5, result, 0.1);
    }
}
