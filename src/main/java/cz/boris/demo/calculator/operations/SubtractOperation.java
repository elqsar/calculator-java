package cz.boris.demo.calculator.operations;

/**
 * Created by Boris Musatov
 */
public class SubtractOperation extends Operation {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
