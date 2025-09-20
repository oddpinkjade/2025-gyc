package hw_250919.ingredientinventory;

import java.time.LocalDate;
import java.util.List;

public class IngredientService {

    private final IngredientDao ingredientDao;

    public IngredientService(IngredientDao ingredientDao) {
        this.ingredientDao = ingredientDao;
    }

    public boolean addIngredient(String ingredientId, String ingredientName, int quantity, LocalDate createdDate) {
        if (ingredientDao.existsById(ingredientId)) {
            // throw new IllegalArgumentException("이미 등록된 식자재 ID입니다.");
            return false;
        }
        Ingredient ingredient = new Ingredient(ingredientId, ingredientName, quantity, createdDate);
        ingredientDao.save(ingredient);
        return true;
    }

    public List<Ingredient> getAllIngredients() {
        return ingredientDao.findAll();
    }
}
