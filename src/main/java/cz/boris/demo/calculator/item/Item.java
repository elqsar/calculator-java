package cz.boris.demo.calculator.item;

/**
 * Created by Boris Musatov
 */
public class Item {

    private String name;

    private int number;

    public Item(String name, int operation) {
        this.number = operation;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

}
