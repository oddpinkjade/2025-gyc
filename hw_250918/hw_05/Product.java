package hw_250918.hw_05;

public class Product {

    // name, price는 private.
    private String name;
    private int price;

    public Product() {}

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 반드시 set/get 메서드로만 값 설정
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString() 메서드로만 출력 가능.
    // toString() 오버라이딩: "상품명: 이름, 가격: 원" 형식 출력.
    @Override
    public String toString() {
        return "상품명: " + name + ", 가격: " + price + "원";
    }
}
