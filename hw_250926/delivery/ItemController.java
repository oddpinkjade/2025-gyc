package hw_250926.delivery;

import static utils.InputUtils.readInt;
import static utils.InputUtils.readLine;
import static utils.InputUtils.readLong;

import java.util.List;

public class ItemController {

    private static final int MIN_COMMAND_VALUE = 0;
    private static final int MAX_COMMAND_VALUE = 6;

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    public void run() {
        while (true) {
            printMenu();
            int command = readInt("번호 입력: ");

            switch (command) {
                case 1:
                    addItem();
                    break;
                case 2:
                    getAllItems();
                    break;
                case 3:
                    getItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    updateItem();
                    break;
                case 6:
                    reportItemStatistics();
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
        System.out.println("\n===== 재고 관리 프로그램 =====");
        System.out.println("1. 상품 등록");
        System.out.println("2. 전체 상품 조회");
        System.out.println("3. 개별 상품 조회");
        System.out.println("4. 상품 삭제");
        System.out.println("5. 상품 정보 수정");
        System.out.println("6. 통계");
        System.out.println("0. 종료");
    }

    private void addItem() {
        String name = readLine("상품명: ");
        int price = readInt("가격: ");
        int orderLimit = readInt("주문 가능 수: ");
        int stock = readInt("현재 재고: ");

        itemService.addItem(name, price, orderLimit, stock);
        System.out.println("상품 등록 완료");
    }

    private void getAllItems() {
        List<Item> items = itemService.getAllItems();
        if (items.isEmpty()) {
            System.out.println("저장된 상품이 없습니다.");
            return;
        }

        System.out.println("\n[전체 상품 목록]");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    private void getItem() {
        Long id = readLong("조회할 상품번호: ");

        Item item = itemService.getItemById(id);
        System.out.println(item);
    }

    private void deleteItem() {
        Long id = readLong("삭제할 상품번호: ");

        itemService.deleteItem(id);
        System.out.println("상품번호 [" + id + "]이(가) 삭제되었습니다.");
    }

    private void updateItem() {
        Long id = readLong("변경할 상품번호: ");

        Item item = itemService.getItemById(id);
        String name = readLine("변경할 상품명: (" + item.getName() + "): ");
        int price = readInt("변경할 가격: (" + item.getPrice() + "): ");
        int orderLimit = readInt("변경할 주문 가능 수: (" + item.getOrderLimit() + "): ");
        int stock = readInt("변경할 현재 재고: (" + item.getStock() + "): ");

        itemService.updateItem(id, name, price, orderLimit, stock);
        System.out.println("상품번호 [" + id + "]이(가) 변경되었습니다.");
    }

    private void reportItemStatistics() {
        int totalItemCounts = itemService.getTotalItemCount();
        String totalSum = String.format("%,d원", itemService.getSumTotalPrice());

        System.out.println("전체 상품의 수: " + totalItemCounts);
        System.out.println("현재 재고 전체 가격의 합: " + totalSum);
    }
}
