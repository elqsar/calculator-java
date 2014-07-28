package cz.boris.demo.calculator.operations;

/**
 * Created by Boris Musatov
 */
public class AddOperation extends Operation {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
