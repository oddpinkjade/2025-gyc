package hw_250929;

import static utils.InputUtils.readInt;
import static utils.InputUtils.readLine;
import static utils.InputUtils.readLong;

import java.util.List;

public class VisitHistoryController {

    private static final int MIN_COMMAND_VALUE = 0;
    private static final int MAX_COMMAND_VALUE = 5;

    private final VisitHistoryService visitHistoryService;

    public VisitHistoryController(VisitHistoryService visitHistoryService) {
        this.visitHistoryService = visitHistoryService;
    }

    public void run() {

        while (true) {
            printMenu();
            int q = readInt("번호를 입력: ");

            switch (q) {
                case 1: // 맛집 등록
                    addVisitHistory();
                    break;
                case 2:  // 맛집 전체 조회
                    getAllVisitHistories();
                    break;
                case 3: // 맛집 개별 조회
                    getVisitHistory();
                    break;
                case 4: // 맛집 정보 수정
                    updateVisitHistory();
                    break;
                case 5: // 맛집 삭제
                    deleteVisitHistory();
                    break;
                case 0: // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.printf("%d~%d 사이의 숫자만 입력하세요.%n", MIN_COMMAND_VALUE, MAX_COMMAND_VALUE);
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== 맛집 다이어리 =====");
        System.out.println("1. 맛집 등록");
        System.out.println("2. 맛집 전체 조회");
        System.out.println("3. 맛집 개별 조회");
        System.out.println("4. 맛집 정보 수정");
        System.out.println("5. 맛집 삭제");
        System.out.println("0. 프로그램 종료");
    }

    private void addVisitHistory() {
        String name = readLine("상호명 입력: ");
        String visitDate = readLine("방문일 입력(yyyy-mm-dd): ");
        String menu = readLine("대표메뉴 입력: ");
        int rating = readInt("평점 입력(1~5): ");

        visitHistoryService.addVisitHistory(name, visitDate, menu, rating);
        System.out.println("맛집 등록 완료");
    }

    private void getAllVisitHistories() {
        List<VisitHistory> allVisitHistories = visitHistoryService.getAllVisitHistories();
        if (allVisitHistories.isEmpty()) {
            System.out.println("등록된 맛집이 없습니다.");
            return;
        }

        System.out.println("\n[등록된 맛집 목록]");
        for (VisitHistory visitHistory : allVisitHistories) {
            System.out.println(visitHistory);
        }
    }

    public void getVisitHistory() {
        Long id = readLong("조회할 맛집 정보 번호: ");

        VisitHistory visitHistory = visitHistoryService.getVisitHistoryById(id);
        System.out.println(visitHistory);
    }

    public void updateVisitHistory() {
        Long id = readLong("변경할 맛집 정보 번호: ");

        VisitHistory visitHistoryById = visitHistoryService.getVisitHistoryById(id);
        String newName = readLine("변경할 상호명 입력(" + visitHistoryById.getName() + "): ");
        String newVisitDate = readLine("변경할 방문일 입력(" + visitHistoryById.getVisitDate() + "): ");
        String newMenu = readLine("변경할 대표메뉴 입력(" + visitHistoryById.getMenu() + "): ");
        int newRating = readInt("평점 입력(" + visitHistoryById.getRating() + "): ");

        visitHistoryService.updateVisitHistory(id, newName, newVisitDate, newMenu, newRating);
        System.out.println("맛집 정보 번호 [" + id + "]이(가) 변경되었습니다.");
    }

    public void deleteVisitHistory() {
        Long id = readLong("삭제할 맛집 정보 번호: ");

        visitHistoryService.deleteVisitHistory(id);
        System.out.println("맛집 정보 번호 [" + id + "]이(가) 삭제되었습니다.");
    }
}
