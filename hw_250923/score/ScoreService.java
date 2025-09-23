package hw_250923.score;

import java.util.List;

// 총점, 평균, 학점 계산
// DAO에 저장, 조회 요청하는 비즈니스 로직 영역
public class ScoreService {

    private final ScoreDAO scoreDAO;

    // 의존성 주입: 외부에서 DAO 객체를 받아와 내부 변수로 저장.
    // 다른 DAO로 교체 용이
    public ScoreService(ScoreDAO scoreDAO) {
        this.scoreDAO = scoreDAO;
    }

    // 점수 입력, 계산
    public void addScore(String name, int korean, int english, int math) {
        ScoreDTO score = new ScoreDTO(name, korean, english, math);

        int total = korean + english + math;
        double average = total / 3.0;
        String grade = getGrade(average);
        score.setTotal(total);
        score.setAverage(average);
        score.setGrade(grade);

        // 점수 리스트에 학생 한 명의 데이터 추가
        scoreDAO.save(score);
    }

    private String getGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    // DAO(저장소)에 저장된 모든 학생 점수 정보 리스트 호출
    public List<ScoreDTO> getAllScores() {
        return scoreDAO.findAll();
    }

    public int getScoresCounts() {
        return scoreDAO.count();
    }

    // 최고 총점 구하기
    public int getMaxTotalScore() {
        List<ScoreDTO> scores = scoreDAO.findAll();
        if (scores.isEmpty()) {
            return 0;
        }

        // 최댓값: 최솟값에서 시작. 이전 값과 비교해 현재 값이 크면 변수에 재할당
        // 여기서는 0 넣어도 됨
        int max = Integer.MIN_VALUE; // int형이 가질 수 있는 가장 작은 값. -2^31
        //int min = Integer.MAX_VALUE; // int형이 가질 수 있는 가장 큰 값. 2^31
        for (ScoreDTO score : scores) {
            if (max < score.getTotal()) {
                max = score.getTotal();
            }
        }
        return max;
        //return scores.stream().mapToInt(ScoreDTO::getTotal).sum();
    }

    public int getMinTotalScore() {
        List<ScoreDTO> scores = scoreDAO.findAll();
        if (scores.isEmpty()) {
            return 0;
        }

        // 최댓값: 최솟값에서 시작. 이전 값과 비교해 현재 값이 크면 변수에 재할당
        // 여기서는 0 넣어도 됨
        int min = Integer.MAX_VALUE; // int형이 가질 수 있는 가장 큰 값. 2^31
        for (ScoreDTO score : scores) {
            if (min > score.getTotal()) {
                min = score.getTotal();
            }
        }
        return min;
    }

    // 총점들의 평균 구하기
    public double getTotalScoreAverage() {
        List<ScoreDTO> scores = scoreDAO.findAll();
        if (scores.isEmpty()) {
            return 0.0;
        }
        int totalSum = getTotalSum(scores);
        return (double) totalSum / scores.size();
    }

    public int getTotalSum(List<ScoreDTO> scores) {
        int totalSum = 0;
        for (ScoreDTO score : scores) {
            totalSum += score.getTotal();
        }
        return totalSum;
    }
}

