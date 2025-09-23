package hw_250923.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ProductDAO {

    private final List<ProductDTO> products = new ArrayList<>();

    public void save(ProductDTO product) {
        products.add(product);
    }

    public List<ProductDTO> getAllProducts() {
        return Collections.unmodifiableList(products);
    }

    public boolean existsById(int id) {
        return products.stream().anyMatch(p -> p.getId() == id);
    }

    public Optional<ProductDTO> findById(int id) {
        return products.stream()
                .filter(i -> i.getId() == id)
                .findFirst();
//        for (ProductDTO product : products) {
//            if (product.getId() == id) {
//                return Optional.of(product);
//            }
//        }
//        return Optional.empty();
    }

    public boolean update(ProductDTO productDTO) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == productDTO.getId()) {
                products.set(i, productDTO);
                return true;
            }
        }
        return false;
    }

    public boolean deleteById(int id) {
        return products.removeIf(i -> i.getId() == id);
    }

    public int count() {
        return products.size();
    }

    public int sumProductPrices() {
        return products.stream().mapToInt(ProductDTO::getPrice).sum();
    }
}
