package cz.boris.demo.calculator;

import cz.boris.demo.calculator.util.Utils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.*;

/**
 * Created by Boris Musatov
 */
public class UtilsTest {

    @Test
    public void swapTest() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list = Utils.swap(list);
        assertThat(list.get(0)).isEqualTo("C");
    }

    @Test
    public void swatEmptyTest() {
        List<String> list = new ArrayList<>();
        list = Utils.swap(list);
        assertThat(list).isNotNull();
        assertThat(list).isEmpty();
    }
}
