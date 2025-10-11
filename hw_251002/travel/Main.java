package hw_251002.travel;

public class Main {

    public static void main(String[] args) {
        TravelSpotDAO travelSpotDAO = new TravelSpotDAO();
        TravelSpotService travelSpotService = new TravelSpotService(travelSpotDAO);
        TravelSpotController travelSpotController = new TravelSpotController(travelSpotService);
        travelSpotController.run();
    }
}
