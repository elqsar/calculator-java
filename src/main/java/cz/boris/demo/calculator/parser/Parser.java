package cz.boris.demo.calculator.parser;

import cz.boris.demo.calculator.item.Item;

import java.io.IOException;
import java.util.List;

/**
 * Created by Boris Musatov
 */
public interface Parser {

    List<Item> parse(String path) throws IOException;

}
