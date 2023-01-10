package groceries;

import static util.Input.*;

public class GroceryListApp {

    public static void userInterface(GroceryList groceryList) {

        System.out.println("--------------------");
        System.out.format("%16s%n", "GROCERY LIST");

        System.out.print("--------------------\nWould you like to make a list? ");
        boolean yesNo = yesNo();

        if (yesNo) {
             makeList(groceryList);
        }
    }

    public static void makeList(GroceryList groceryList) {
        GroceryList.Section produce = groceryList.new Section("produce");
        GroceryList.Section meat = groceryList.new Section("meat & fish");
        GroceryList.Section dairy = groceryList.new Section("dairy");
        GroceryList.Section drygoods = groceryList.new Section("dry goods");
        boolean yesNo = true;

        do {
        System.out.print("--------------------");
        System.out.format("%n%s%n%s%n%s%n%s%n", "[Produce]", "[Meat & Fish]", "[Dairy]", "[Dry Goods]");
        System.out.print("--------------------\nChoose a list: ");
        String userInput = getString();

            if (groceryList.categories.contains(userInput.toLowerCase())) {
                System.out.println("--------------------");
                System.out.format("%s%n", userInput.toUpperCase());
                System.out.print("--------------------\nItem Name: ");
                String addItem = getString();
                System.out.print("Quantity: ");
                int numItem = getNum();
                System.out.println("--------------------");
                getString();

                switch (userInput.toLowerCase()) {
                    case "produce":
                        produce.addItem(addItem, numItem);
                        break;
                    case "meat & fish":
                        meat.addItem(addItem, numItem);
                        break;
                    case "dairy":
                        dairy.addItem(addItem, numItem);
                        break;
                    case "dry goods":
                        drygoods.addItem(addItem, numItem);
                        break;
                }

                System.out.print("--------------------\nWould you like to go again? ");
                yesNo = yesNo();
            }
        } while (yesNo);

        System.out.println("--------------------");
        System.out.format("%16s%n", "GROCERY LIST");
        produce.getSectionItems();
        meat.getSectionItems();
        dairy.getSectionItems();
        drygoods.getSectionItems();

    }

    public static void main(String[] args) {

        GroceryList myList = new GroceryList("Grocery Run");
        userInterface(myList);

    }

}