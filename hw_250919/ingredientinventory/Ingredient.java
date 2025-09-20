package hw_250919.ingredientinventory;

import java.time.LocalDate;

public class Ingredient {

    private String ingredientId;
    private String ingredientName;
    private int quantity;
    private LocalDate createdDate;

    public Ingredient(String ingredientId, String ingredientName, int quantity, LocalDate createdDate) {
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
        this.quantity = quantity;
        this.createdDate = createdDate;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientId='" + ingredientId + '\'' +
                ", ingredientName='" + ingredientName + '\'' +
                ", quantity=" + quantity +
                ", createdDate=" + createdDate +
                '}';
    }
}
