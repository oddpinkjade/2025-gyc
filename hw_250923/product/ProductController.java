package hw_250923.product;

import static hw_250923.InputUtils.readInt;
import static hw_250923.InputUtils.readLine;

import java.util.List;
import java.util.Scanner;

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
//            System.out.println("번호 입력: 1-상품등록, 2-전체상품조회, 3-개별상품조회, " +
//                    "4-상품삭제, 5-상품정보수정, 6-분석, 0-프로그램종료");
            printMenu();
            int q = scanner.nextInt();
            scanner.nextLine();

            switch (q) {
                case 1: // 1-상품등록
                    addProduct();
                    break;
                case 2: // 2-전체상품조회
                    getAllProducts();
                    break;
                case 3: // 3-개별상품조회
                    getProduct();
                    break;
                case 4: // 4-상품삭제
                    deleteProduct();
                    break;
                case 5: // 5-상품정보수정
                    updateProduct();
                    break;
                case 6: // 6-분석 (전체 상품의 수, 전체 상품 가격의 합)
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
        int id = readInt("상품번호: ");
        String name = readLine("상품명: ");
        int quantity = readInt("수량: ");
        int price = readInt("가격: ");

        productService.addProduct(id, name, quantity, price);
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
        int id = readInt("상품번호: ");

        ProductDTO product = productService.getProductById(id);
        System.out.println(product);
    }

    private void deleteProduct() {
        int id = readInt("상품번호: ");

        productService.deleteProductById(id);
        System.out.println("상품번호 [" + id + "]이(가) 삭제되었습니다.");
    }

    private void updateProduct() {
        int id = readInt("상품번호: ");
        String name = readLine("상품명: ");
        int quantity = readInt("수량: ");
        int price = readInt("가격: ");

        productService.updateProduct(id, name, quantity, price);
        System.out.println("상품번호 [" + id + "]이(가) 수정되었습니다.");
    }

    private void reportProductStatistics() {
        int totalProductCount = productService.getTotalProductCount();
        int totalPrice = productService.getTotalPrice();

        System.out.println("전체 상품의 수: " + totalProductCount);
        System.out.println("전체 상품 가격의 합: " + totalPrice);
    }
}

