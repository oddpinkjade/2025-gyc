package hw_250929;

public class Main {

    public static void main(String[] args) {
        String fileName = "db/visitHistories.csv";
        VisitHistoryDAO visitHistoryDAO = new VisitHistoryDAO(fileName);
        VisitHistoryService visitHistoryService = new VisitHistoryService(visitHistoryDAO);
        VisitHistoryController visitHistoryController = new VisitHistoryController(visitHistoryService);
        visitHistoryController.run();
    }
}
