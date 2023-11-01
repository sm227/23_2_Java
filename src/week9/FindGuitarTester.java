package week9;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0 , "fender", "Stratocaster", "electric", "Alder", "Alder");

        Guitar guitar = inventory.search(whatErinLikes);

        if (guitar != null) {
            System.out.println("Erin, you might like this "
            + guitar.getBuilder() + " " + guitar.getModel() + " "
                    + guitar.getType() + "guitar:\n "
                    + guitar.getBackWood() + " back and sides, \n "
                    + guitar.getTopWood() + " top.\n"
                    + "You can have it for only $" + guitar.getPrice() + "!"
                    );
        }

        else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }


    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("11277", 3999.95, "Collings","CJ","acoustic","Indian Rosewood","Sitka");
        inventory.addGuitar("V95693", 1499.95, "Fender","Stratocastor","electiric","Alder","Alder");
    }
}
