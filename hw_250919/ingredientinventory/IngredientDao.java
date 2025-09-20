package hw_250919.ingredientinventory;

import java.util.ArrayList;
import java.util.List;

public class IngredientDao {

    private final List<Ingredient> ingredients = new ArrayList<>();

    public void save(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public List<Ingredient> findAll() {
        return List.copyOf(ingredients); // 불변 리스트 반환
    }

    public boolean existsById(String ingredientId) {
        return ingredients.stream()
                .anyMatch(i -> i.getIngredientId().equals(ingredientId));
    }
}
