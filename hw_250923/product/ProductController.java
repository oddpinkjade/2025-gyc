package hw_250923.product;

import static utils.InputUtils.readInt;
import static utils.InputUtils.readLine;

import java.util.List;
import java.util.Scanner;

// 사용자 제어 영역
public class ProductController {

    private final int MIN_COMMAND_VALUE = 0;
    private final int MAX_COMMAND_VALUE = 6;

    private final Scanner scanner = new Scanner(System.in);
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void run() {
        while (true) {
            printMenu();
            int q = scanner.nextInt();
            scanner.nextLine();

            switch (q) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    getAllProducts();
                    break;
                case 3:
                    getProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    updateProduct();
                    break;
                case 6:
                    reportProductStatistics();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.printf("%d~%d 사이의 숫자만 입력하세요.%n", MIN_COMMAND_VALUE, MAX_COMMAND_VALUE);
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== 상품 관리 프로그램 =====");
        System.out.println("1. 상품 등록");
        System.out.println("2. 전체 상품 조회");
        System.out.println("3. 개별 상품 조회");
        System.out.println("4. 상품 삭제");
        System.out.println("5. 상품 정보 수정");
        System.out.println("6. 분석");
        System.out.println("0. 종료");
        System.out.print("> ");
    }

    private void addProduct() {
        //int id = readInt("상품번호: ");
        String name = readLine("상품명: ");
        int quantity = readInt("수량: ");
        int price = readInt("가격: ");

        //productService.addProduct(id, name, quantity, price);
        productService.addProduct(name, quantity, price);
        System.out.println("상품 등록 완료");
    }

    private void getAllProducts() {
        List<ProductDTO> products = productService.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("저장된 상품이 없습니다.");
            return;
        }

        System.out.println("\n[전체 상품 목록]");
        for (ProductDTO product : products) {
            System.out.println(product);
        }
    }

    private void getProduct() {
        int id = readInt("조회할 상품번호: ");

        ProductDTO product = productService.getProductById(id);
        System.out.println(product);
    }

    private void deleteProduct() {
        int id = readInt("삭제할 상품번호: ");

        productService.deleteProductById(id);
        System.out.println("상품번호 [" + id + "]이(가) 삭제되었습니다.");
    }

    private void updateProduct() {
        int id = readInt("변경할 상품번호: ");

        ProductDTO productById = productService.getProductById(id);
        String name = readLine("변경할 상품명: (" + productById.getName() + "): ");
        int quantity = readInt("변경할 수량: (" + productById.getQuantity() + "): ");
        int price = readInt("변경할 가격: (" + productById.getPrice() + "): ");

        productService.updateProduct(id, name, quantity, price);
        System.out.println("상품번호 [" + id + "]이(가) 변경되었습니다.");

        // 수업 때 다룬 코드
//        ProductDTO productById = productService.getProductById(id);
//        if (productById != null) {
//            productService.updateProduct(id, name, quantity, price);
//            System.out.println("상품번호 [" + id + "]이(가) 수정되었습니다.");
//        } else {
//            System.out.println("해당 ID의 상품이 존재하지 않아 업데이트할 수 없습니다: " + id);
//        }
    }

    private void reportProductStatistics() {
        int totalProductCount = productService.getTotalProductCount();
        String totalPrice = String.format("%,d원", productService.getTotalPrice());

        System.out.println("전체 상품의 수: " + totalProductCount);
        System.out.println("전체 상품 가격의 합: " + totalPrice);
    }
}

