package cz.boris.demo.calculator;

import cz.boris.demo.calculator.calculator.Calculator;
import cz.boris.demo.calculator.calculator.DefaultCalculator;
import cz.boris.demo.calculator.parser.DefaultParser;
import cz.boris.demo.calculator.parser.Parser;

import java.io.IOException;

/**
 * Created by Boris Musatov
 */
public class Application {

    public static void main(String[] args) {
        try {
            Parser parser = new DefaultParser();
            Calculator calculator = new DefaultCalculator();
            int result = calculator.calculate(parser.parse(args[0]));
            System.out.println("Result is: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
