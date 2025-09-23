package hw_250923.product;

/*
 * 상품 관리 프로그램
 * 1. 상품 등록: 상품명, 수량, 가격, 상품번호(자동생성)
 * 2. 전체 상품 조회: 상품번호, 상품명, 수량, 가격, 합계
 * 3. 개별 상품 조회: 원하는 상품 번호 입력하면 해당 상품만 조회
 * 4. 상품 삭제: 삭제할 상품 번호 입력 시 해당 상품 삭제
 * 5. 상품 정보 수정: 수정할 상품 번호 입력 시 해당 상품 정보 수정
 * 6. 분석: 전체 상품의 수, 전체 상품 가격의 합
 * 0. 프로그램 종료
 */
public class ProductDTO {

    private int id;       // 상품번호
    private String name;  // 상품명
    private int quantity; // 수량
    private int price;    // 가격
    private int total;    // 합계 = quantity * price

    public ProductDTO(int id, String name, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = quantity * price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        setTotal(); // price가 변경되면 자동 갱신
    }

    // 수량과 가격이 변동되면 합계도 자동 갱신
    private void setTotal() {
        this.total = this.price * this.quantity;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}

