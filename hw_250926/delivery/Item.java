package hw_250926.delivery;

// TODO: 클래스명 재고
public class Item {

    private Long id;
    private String name;
    private int price;
    private int orderLimit;
    private int stock;
    private int totalPrice;

    public Item(Long id, String name, int price, int orderLimit, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.orderLimit = orderLimit;
        this.stock = stock;
        this.totalPrice = price * stock;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getOrderLimit() {
        return orderLimit;
    }

    public int getStock() {
        return stock;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
        setTotalPrice();
    }

    public void setOrderLimit(int orderLimit) {
        this.orderLimit = orderLimit;
    }

    public void setStock(int stock) {
        this.stock = stock;
        setTotalPrice();
    }

    private void setTotalPrice() {
        this.totalPrice = this.price * this.stock;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", orderLimit=" + orderLimit +
                ", stock=" + stock +
                '}';
    }
}
