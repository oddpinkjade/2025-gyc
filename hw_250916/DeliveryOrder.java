package hw_250916;

public class DeliveryOrder {

    private String food;
    private String address;

    public DeliveryOrder(String food, String address) {
        this.food = food;
        this.address = address;
    }

    public void deliver() {
        System.out.println("주문 완료했습니다.");
    }
}
