package hw_250929;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class VisitHistoryService {

    private final VisitHistoryDAO visitHistoryDAO;
    private final AtomicLong nextId;

    public VisitHistoryService(VisitHistoryDAO visitHistoryDAO) {
        this.visitHistoryDAO = visitHistoryDAO;
        this.nextId = new AtomicLong(1);
    }

    // 맛집 등록
    public void addVisitHistory(String name, String visitDate, String menu, int rating) {
        long id = nextId.getAndIncrement();
        VisitHistory visitHistory = new VisitHistory(id, name, visitDate, menu, rating);
        visitHistoryDAO.save(visitHistory);
    }

    // 맛집 전체 조회
    public List<VisitHistory> getAllVisitHistories() {
        return visitHistoryDAO.findAll();
    }

    // 맛집 개별 조회
    public VisitHistory getVisitHistoryById(Long id) {
        return visitHistoryDAO.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 ID의 맛집 정보가 존재하지 않습니다: " + id));
    }

    // 맛집 정보 수정
    public void updateVisitHistory(Long id, String name, String visitDate, String menu, int rating) {
        if (!visitHistoryDAO.existById(id)) {
            throw new IllegalArgumentException("해당 ID의 맛집 정보가 존재하지 않습니다: " + id);
        }
        visitHistoryDAO.update(id, name, visitDate, menu, rating);
    }

    // 맛집 삭제
    public void deleteVisitHistory(Long id) {
        boolean deleted = visitHistoryDAO.delete(id);
        if (!deleted) {
            throw new IllegalArgumentException("해당 ID의 맛집 정보가 존재하지 않습니다: " + id);
        }
    }
}
