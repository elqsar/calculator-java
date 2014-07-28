package cz.boris.demo.calculator;

import cz.boris.demo.calculator.calculator.Calculator;
import cz.boris.demo.calculator.calculator.DefaultCalculator;
import cz.boris.demo.calculator.item.Item;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.*;

/**
 * Created by Boris Musatov
 */
public class CalculatorTest {

    private List<Item> data;
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new DefaultCalculator();
        data = new ArrayList<>();
    }

    @After
    public void tearDown() {
        calculator = null;
        data.clear();
        data = null;
    }

    @Test
    public void calculatorCreatedTest() {
        assertThat(calculator).isNotNull();
    }

    @Test
    public void calculatorCalculateTest() {
        data.add(new Item("apply", 5));
        data.add(new Item("add", 2));
        int result = calculator.calculate(data);
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void calculatorOnlyApplyTest() {
        data.add(new Item("apply", 5));
        int result = calculator.calculate(data);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void calculatorEmptyTest() {
        int result = calculator.calculate(data);
        assertThat(result).isEqualTo(0);
    }

}
