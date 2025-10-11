package hw_251002.travel;

import java.util.Arrays;

public enum Season {
    SPRING("봄"),
    SUMMER("여름"),
    FALL("가을"),
    WINTER("겨울"),
    ;

    private final String label;

    Season(String label) {
        this.label = label;
    }

    public static Season fromLabel(String label) {
        return Arrays.stream(Season.values())
                .filter(season -> season.label.equals(label))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("계절명이 올바르지 않습니다: " + label));
    }
}
