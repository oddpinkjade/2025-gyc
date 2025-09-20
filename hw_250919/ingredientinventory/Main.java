package hw_250919.ingredientinventory;

public class Main {

    public static void main(String[] args) {
        IngredientDao dao = new IngredientDao();
        IngredientService service = new IngredientService(dao);
        IngredientController controller = new IngredientController(service);
        controller.run();
    }
}
