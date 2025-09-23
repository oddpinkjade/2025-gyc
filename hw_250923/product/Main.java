package hw_250923.product;

public class Main {

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        ProductService service = new ProductService(dao);
        ProductController controller = new ProductController(service);
        controller.run();
    }
}
