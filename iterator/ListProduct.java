import java.util.Iterator;

public class ListProduct implements Product {
    static final int MAX_ITEMS = 120;
    int numberOfItems = 0;
    String[] menuItems;

    public ListProduct() {
        menuItems = new String[MAX_ITEMS];        
    }

    public void addItem(String name)
    {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = name;
            numberOfItems = numberOfItems + 1;
        }
    }

    public String[] getMenuItems() {
        return menuItems;
    }

    public Iterator<String> createIterator() {
        return new ListProductIterator(menuItems);
    }

    public String toString() {
        return "List Product";
    }    
}