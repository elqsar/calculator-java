package cz.boris.demo.calculator;

import cz.boris.demo.calculator.operations.OperationService;
import cz.boris.demo.calculator.operations.AddOperation;
import cz.boris.demo.calculator.operations.DivideOperation;
import cz.boris.demo.calculator.operations.MultiplyOperation;
import cz.boris.demo.calculator.operations.SubtractOperation;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.*;

/**
 * Created by Boris Musatov
 */
public class OperationServiceTest {

    @Test
    public void getOperationTest() {
        assertThat(OperationService.query("add")).isInstanceOf(AddOperation.class);
        assertThat(OperationService.query("subtract")).isInstanceOf(SubtractOperation.class);
        assertThat(OperationService.query("multiply")).isInstanceOf(MultiplyOperation.class);
        assertThat(OperationService.query("divide")).isInstanceOf(DivideOperation.class);
    }

    @Test
    public void getNonExistentOperation() {
        assertThat(OperationService.query("not")).isNull();
    }

}
