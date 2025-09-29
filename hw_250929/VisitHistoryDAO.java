package hw_250929;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VisitHistoryDAO {

    private final List<VisitHistory> visitHistories = new ArrayList<>();

    // 맛집 등록
    public void save(VisitHistory history) {
        visitHistories.add(history);
    }

    // 맛집 전체 조회
    public List<VisitHistory> findAll() {
        return visitHistories;
    }

    // 맛집 개별 조회
    public Optional<VisitHistory> findById(Long id) {
        return visitHistories.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst();
    }

    // 맛집 정보 수정
    public void update(Long id, String newName, String newVisitDate, String newMenu, int newRating) {
        visitHistories.stream()
                .filter(v -> v.getId().equals(id))
                .forEach(v -> {
                    v.setName(newName);
                    v.setVisitDate(newVisitDate);
                    v.setMenu(newMenu);
                    v.setRating(newRating);
                });
    }

    // 맛집 삭제
    public boolean delete(Long id) {
        return visitHistories.removeIf(v -> v.getId().equals(id));
    }

    public boolean existById(Long id) {
        return visitHistories.stream().anyMatch(v -> v.getId().equals(id));
    }
}
