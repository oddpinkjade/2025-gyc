package hw_20250929;

public class VisitHistory {

    private final Long id;
    private String name;
    private String visitDate;
    private String menu;
    private int rating;

    public VisitHistory(Long id, String name, String visitDate, String menu, int rating) {
        this.id = id;
        this.name = name;
        this.visitDate = visitDate;
        this.menu = menu;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public String getMenu() {
        return menu;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("상호명: ").append(name)
                .append(", 방문일: ").append(visitDate)
                .append(", 대표메뉴: ").append(menu)
                .append(", 평점: ").append(rating);

        /* 문항 5 - 평점이 5점이면 “여긴 인생 맛집!” 메시지 출력 */
        if (rating == 5) {
            result.append(" - 여긴 인생 맛집! 친구에게 추천!");
        }
        return result.toString();
    }
}
