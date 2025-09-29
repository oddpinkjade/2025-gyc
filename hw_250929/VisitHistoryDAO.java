package hw_250929;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VisitHistoryDAO {

    private final String fileName;
    private final List<VisitHistory> visitHistories;

    public VisitHistoryDAO(String fileName) {
        this.fileName = fileName;
        this.visitHistories = loadCsv(fileName);
    }

    // 맛집 등록
    public void save(VisitHistory history) {
        visitHistories.add(history);
        writeCsv();
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
        writeCsv();
    }

    // 맛집 삭제
    public boolean delete(Long id) {
        boolean removed = visitHistories.removeIf(v -> v.getId().equals(id));
        if (removed) {
            writeCsv();
        }
        return removed;
    }

    public boolean existById(Long id) {
        return visitHistories.stream().anyMatch(v -> v.getId().equals(id));
    }

    private List<VisitHistory> loadCsv(String fileName) {
        List<VisitHistory> visitHistories = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine(); // 첫 줄 스킵

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                // TODO: parts.length 검사

                Long id = Long.parseLong(parts[0].trim());
                String name = parts[1].trim();
                String visitDate = parts[2].trim();
                String menu = parts[3].trim();
                int rating = Integer.parseInt(parts[4].trim());
                visitHistories.add(new VisitHistory(id, name, visitDate, menu, rating));
            }

        } catch (IOException e) { // TODO: 에러 처리 더 구체적으로
            System.out.println("파일 읽기 실패: " + e.getMessage());
        }

        return visitHistories;
    }

    private void writeCsv() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("id,name,visitDate,menu,rating");
            for (VisitHistory visitHistory : visitHistories) {
                pw.printf("%d,%s,%s,%s,%d\n",
                        visitHistory.getId(), visitHistory.getName(), visitHistory.getVisitDate(),
                        visitHistory.getMenu(), visitHistory.getRating());
            }
        } catch (IOException e) {
            System.out.println("파일 저장 실패: " + e.getMessage());
        }
    }
}
