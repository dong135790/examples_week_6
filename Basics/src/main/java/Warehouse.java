/**
 * A tester class to demonstrate constructing {@link InventoryItem InventoryItem} objects.
 */
public class Warehouse {

    /**
     * A non-static method skeleton to demonstrate calling non-static methods.
     */
    public void foo() {

    }


    public static void main(String[] args) {

        // A call to non-static method foo() from main will generate an error:
        // Non-static method foo() cannot be referenced from a static context.
//        foo();

        // To call foo we must create an instance of Warehouse.
        Warehouse w = new Warehouse();
        w.foo();

        // Demonstrates accessing a public static data member from another class.
        // public static data members should also be final.
        System.out.println(Constants.GREETING);

        // Create a new instance of InventoryItem
        InventoryItem ii1 = new InventoryItem("Apples", 50);
        // Demonstrates how to access the static member inventoryCount
        System.out.println(InventoryItem.inventoryCount);

        // Create a new instance of InventoryItem
        InventoryItem ii2 = new InventoryItem("Apples", 50);
        // Demonstrates how to access the static member inventoryCount
        // The value should be 2.
        System.out.println(InventoryItem.inventoryCount);


        // ii1 == ii2 will be FALSE because the references don't point to the same object.

        // ii1.equals(ii2) should be TRUE since we have overriden the equals method.
        if (ii1.equals(ii2)) { // ii2.equals(ii1)
            System.out.println("SAME!");
        } else {
            System.out.println("DIFFERENT!");
        }

    }
}
