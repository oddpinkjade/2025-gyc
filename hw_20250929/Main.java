package hw_20250929;

public class Main {

    public static void main(String[] args) {
        VisitHistoryDAO visitHistoryDAO = new VisitHistoryDAO();
        VisitHistoryService visitHistoryService = new VisitHistoryService(visitHistoryDAO);
        VisitHistoryController visitHistoryController = new VisitHistoryController(visitHistoryService);
        visitHistoryController.run();
    }
}
