package hw_250918.hw_05;

public class Main {

    // main에서 set메서드로 값 저장 후, toString()으로 출력.
    public static void main(String[] args) {
        Product product = new Product();
        // 반드시 set/get 메서드로만 값 설정,
        product.setName("맥북");
        product.setPrice(1000);
        // toString() 메서드로만 출력 가능.
        System.out.println(product);
    }
}
