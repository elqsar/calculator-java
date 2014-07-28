package cz.boris.demo.calculator;

import cz.boris.demo.calculator.item.Item;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.*;

/**
 * Created by Boris Musatov
 */
public class ItemTest {

    @Test
    public void itemTest() {
        Item item = new Item("add", 5);
        assertThat(item).isNotNull();
        assertThat(item.getName()).isEqualTo("add");
        assertThat(item.getNumber()).isEqualTo(5);
    }

}
