import java.util.*;

public class Menu {

    public static void main(String args[]) {
        ListProduct list = new ListProduct();                    
        
        list.addItem("Skin Care");
        list.addItem("Sabun");
        list.addItem("Shampo");
        list.addItem("Pasta Gigi");
        list.addItem("Sikat Gigi");
        list.addItem("Parfum");

        list.addItem("Kopi Kapal Api");
        list.addItem("Indomie");
        list.addItem("Aqua");
        list.addItem("Teh Botol");
        list.addItem("Pocari Sweat");
        list.addItem("Mizone");

        Iterator<String> listProduct = list.createIterator();        

        System.out.println("\nMENU\n");
        printMenu(listProduct);

        System.out.println("");
    }

    private static void printMenu(Iterator<String> iterator) {
        int i = 0;
        while (iterator.hasNext()) {
            i += 1;
            String menuItem = (String)iterator.next();
            System.out.println(i + ". " + menuItem);

        }
    }
}