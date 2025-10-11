package hw_251002.travel;

public class TravelSpot {

    private static final int MIN_RATING = 0;
    private static final int MAX_RATING = 5;

    private Long id;
    private String name;
    private String location;
    private Season season;
    private double rating;

    // 등록용
    public TravelSpot(String name, String location, Season season, double rating) {
        validateRating(rating);
        this.name = name;
        this.location = location;
        this.season = season;
        this.rating = rating;
    }

    // 조회용
    public TravelSpot(Long id, String name, String location, Season season, double rating) {
        this(name, location, season, rating);
        this.id = id;
    }

    private void validateRating(double rating) {
        if (rating < MIN_RATING || rating > MAX_RATING) {
            throw new IllegalArgumentException("평점은 0.0 이상 5.0 이하여야 합니다.");
        }
    }

    @Override
    public String toString() {
        return String.format(
                "- 장소명:%s, 위치: %s, 평점:%.1f",
                name, location, rating
        );
    }
}
