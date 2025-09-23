package hw_250923.product;

import java.util.List;

public class ProductService {

    private final ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public void addProduct(int id, String name, int quantity, int price) {
        if (productDAO.existsById(id)) {
            throw new IllegalArgumentException("이미 존재하는 상품 ID입니다: " + id);
        }
        ProductDTO product = new ProductDTO(id, name, quantity, price);
        productDAO.save(product);
    }

    public List<ProductDTO> getAllProducts() {
        return productDAO.getAllProducts();
    }

    public ProductDTO getProductById(int id) {
        return productDAO.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 ID의 상품이 존재하지 않습니다: " + id));
    }

    public void updateProduct(int id, String name, int quantity, int price) {
        ProductDTO newProduct = new ProductDTO(id, name, quantity, price);
        boolean updated = productDAO.update(newProduct);
        if (!updated) {
            throw new IllegalArgumentException("해당 ID의 상품이 존재하지 않아 업데이트할 수 없습니다: " + id);
        }
    }

    public void deleteProductById(int id) {
        boolean deleted = productDAO.deleteById(id);
        if (!deleted) {
            throw new IllegalArgumentException("해당 ID의 상품이 존재하지 않습니다: " + id);
        }
    }

    public int getTotalProductCount() {
        return productDAO.count();
    }

    public int getTotalPrice(){
        return productDAO.sumProductPrices();
    }
}

