package cz.boris.demo.calculator.util;

import java.util.List;

/**
 * Created by Boris Musatov
 */
public final class Utils {

    private Utils() {}

    public static List<String> swap(List<String> list) {
        if(!list.isEmpty()) {
            list.add(0, list.remove(list.size() - 1));
        }
        return list;
    }
}
