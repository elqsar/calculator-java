package cz.boris.demo.calculator;

import cz.boris.demo.calculator.parser.DefaultParser;
import cz.boris.demo.calculator.item.Item;
import cz.boris.demo.calculator.parser.Parser;
import org.fest.assertions.data.Index;
import org.junit.Test;

import java.util.List;

import static org.fest.assertions.api.Assertions.*;

/**
 * Created by Boris Musatov
 */
public class ParserTest {

    @Test
    public void parseTest() throws Exception{
        Parser parser = new DefaultParser();
        List<Item> result = parser.parse("test.txt");
        assertThat(result).isNotNull();
        assertThat(result.size()).isEqualTo(5);
        assertThat(result.get(0)).isInstanceOf(Item.class);
    }

}
