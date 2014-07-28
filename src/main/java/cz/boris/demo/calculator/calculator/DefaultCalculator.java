package cz.boris.demo.calculator.calculator;

import cz.boris.demo.calculator.item.Item;
import cz.boris.demo.calculator.operations.Operation;
import cz.boris.demo.calculator.operations.OperationService;

import java.util.List;

/**
 * Created by Boris Musatov
 */
public class DefaultCalculator implements Calculator {

    @Override
    public int calculate(List<Item> items) {
        int result = 0;
        if (!items.isEmpty()) {
            result = items.remove(0).getNumber();
            for (Item item : items) {
                Operation operation = OperationService.query(item.getName());
                result = operation.execute(result, item.getNumber());
            }
        }
        return result;
    }

}
