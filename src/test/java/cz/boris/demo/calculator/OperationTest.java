package cz.boris.demo.calculator;

import cz.boris.demo.calculator.operations.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Boris Musatov
 */
public class OperationTest {

    @Test
    public void addTest() {
        Operation operation = new AddOperation();
        int result = operation.execute(1, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void subtractTest() {
        Operation operation = new SubtractOperation();
        int result = operation.execute(1, 2);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void multiplyTest() {
        Operation operation = new MultiplyOperation();
        int result = operation.execute(-1, 2);
        Assert.assertEquals(-2, result);
    }

    @Test
    public void divideTest() {
        Operation operation = new DivideOperation();
        int result = operation.execute(5, 5);
        Assert.assertEquals(1, result);
    }
}
