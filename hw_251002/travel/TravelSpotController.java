package hw_251002.travel;

import static utils.InputUtils.readLine;

import java.util.List;

public class TravelSpotController {

    private final TravelSpotService travelSpotService;

    public TravelSpotController(TravelSpotService travelSpotService) {
        this.travelSpotService = travelSpotService;
    }

    public void run() {
        System.out.println("\n===== 여행 추천 리스트 프로그램 =====");

        while (true) {
            String seasonInput = readLine("계절 입력: ");

            List<TravelSpot> recommendedSpotsBySeason = travelSpotService.getRecommendedSpotsBySeason(seasonInput);
            if (recommendedSpotsBySeason.isEmpty()) {
                System.out.println("등록된 추천 여행지가 없습니다.");
                return;
            }
            System.out.printf("\n[%s 추천 여행지]\n", seasonInput);
            for (TravelSpot travelSpot : recommendedSpotsBySeason) {
                System.out.println(travelSpot.toString());
            }
            System.out.println();
        }
    }
}
