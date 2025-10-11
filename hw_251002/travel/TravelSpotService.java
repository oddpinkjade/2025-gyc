package hw_251002.travel;

import java.util.List;

public class TravelSpotService {

    private final TravelSpotDAO travelSpotDAO;

    public TravelSpotService(TravelSpotDAO travelSpotDAO) {
        this.travelSpotDAO = travelSpotDAO;
    }

    public List<TravelSpot> getRecommendedSpotsBySeason(String seasonInput) {
        Season season = Season.fromLabel(seasonInput);
        return travelSpotDAO.findBySeason(season);
    }
}
