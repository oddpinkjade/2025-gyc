package hw_251002.youtube;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Video {

    public static final String PRINT_FORMAT =
            "%-3s | %-20s | %-15s | %-19s | %-8s | %-6s"; // TODO: 포맷 바꾸면, private으로 바꾸기
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private Long id;
    private String title;
    private String channel;
    private LocalDateTime uploadDate;
    private Integer views; // TODO: 자료형 int vs Integer
    private Integer likes;

    // insert용
    public Video(String title, String channel, LocalDateTime uploadDate, Integer views, Integer likes) {
        validateViews(views);
        validateLikes(likes);
        this.title = title;
        this.channel = channel;
        this.uploadDate = uploadDate;
        this.views = views;
        this.likes = likes;
    }

    // 조회용
    public Video(Long id, String title, String channel, LocalDateTime uploadDate, Integer views, Integer likes) {
        this(title, channel, uploadDate, views, likes);
        this.id = id;
    }

    private void validateViews(Integer views) {
        if (views == null || views < 0) {
            throw new IllegalArgumentException("조회수는 0 이상이어야 합니다.");
        }
    }

    private void validateLikes(Integer likes) {
        if (likes == null || likes < 0) {
            throw new IllegalArgumentException("좋아요 수는 0 이상이어야 합니다.");
        }
    }

//    private void validateNonNegative(String fieldName, Integer value) {
//        if (value == null || value < 0) {
//            throw new IllegalArgumentException(fieldName + "는 0 이상이어야 합니다.");
//        }
//    }
    // 필드명을 하드코딩해야 하는 게 마음에 들지 않는다.
    // 필드명을 enum으로 관리할 수도 있지만, 지금 단계에서는 오버엔지니어링

    @Override
    public String toString() {
        return String.format(
                PRINT_FORMAT,
                id, title, channel, uploadDate.format(FORMATTER), views, likes
        );
    }
}
