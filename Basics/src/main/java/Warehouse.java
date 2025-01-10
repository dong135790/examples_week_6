public class Warehouse {

    public static void main(String[] args) {

//        System.out.println(Constants.GREETING);

        InventoryItem ii1 = new InventoryItem("Apples", 50);
        InventoryItem ii2 = new InventoryItem("Pears", 100);



        System.out.println(ii1.getName());
        ii1.setName("Gala");
        System.out.println(ii1.getName());

        boolean result = ii2.purchase(23);
        System.out.println(result);


        System.out.println(ii1.toString());

    }
}
