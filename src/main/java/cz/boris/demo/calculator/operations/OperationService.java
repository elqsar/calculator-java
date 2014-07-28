package cz.boris.demo.calculator.operations;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Boris Musatov
 */
public class OperationService {

    public static final String ADD = "add";

    public static final String SUBTRACT = "subtract";

    public static final String MULTIPLY = "multiply";

    public static final String DIVIDE = "divide";

    private static Map<String, Operation> operations = new HashMap<>();

    static {
        operations.put(ADD, new AddOperation());
        operations.put(SUBTRACT, new SubtractOperation());
        operations.put(MULTIPLY, new MultiplyOperation());
        operations.put(DIVIDE, new DivideOperation());
    }

    public static Operation query(String name) {
        return operations.get(name);
    }
}