package cz.boris.demo.calculator.parser;

import com.google.common.collect.Lists;
import com.google.common.io.Files;
import cz.boris.demo.calculator.item.Item;
import cz.boris.demo.calculator.util.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Boris Musatov
 */
public class DefaultParser implements Parser {

    public static final String WHITE_SPACE = " ";

    @Override
    public List<Item> parse(String path) throws IOException {
        List<Item> items = Lists.newArrayList();
        List<String> lines = Files.readLines(new File(path), Charset.defaultCharset());
        lines = Utils.swap(lines);
        for (String line : lines) {
            createItem(items, line);
        }
        return items;
    }

    private void createItem(List<Item> items, String line) {
        String[] data = line.trim().split(WHITE_SPACE);
        items.add(new Item(data[0], Integer.parseInt(data[1])));
    }

}
