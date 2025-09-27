package hw_250926.delivery;

public class Main {

    public static void main(String[] args) {
        String fileName = "db/deliveryitems.csv";
        ItemDao dao = new ItemDao(fileName);
        ItemService service = new ItemService(dao);
        ItemController controller = new ItemController(service);
        controller.run();
    }
}
