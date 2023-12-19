package week9.version02;

import java.util.Iterator;
import java. util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory(); // Inventory 생성 -> Guitar 타입의 새로운 링크드 리스트가 생성됨.
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        if(!matchingGuitars.isEmpty()) {

            System.out.println("Erin, you like these guitars:");

            for(Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar) i.next();
                System.out.println(" We have a " + guitar.getBuilder() + " "
                        + guitar.getModel() + " "
                        + guitar.getType() + " guitar:\n     "
                        + guitar.getBackWood() + " back and sides,\n     "
                        + guitar.getTopWood() + " top.\n "
                        +"You can have it for only $" + guitar.getPrice()
                        + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA);
        inventory.addGuitar("V9563", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }

}