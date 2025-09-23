package hw_250923.score;

import java.util.List;
import java.util.Scanner;

public class ScoreController {

    private final Scanner scanner = new Scanner(System.in);
    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    public void run() {
        while (true) {
            System.out.println("번호 입력: 1-점수입력, 2-조회, 3-학생수, 4-분석, 0-종료");
            int q = scanner.nextInt();
            scanner.nextLine();

            switch (q) {
                case 1:
                    //addScore();
                    System.out.println("이름: ");
                    String name = scanner.nextLine();
                    System.out.println("국어: ");
                    int korean = scanner.nextInt();
                    System.out.println("영어: ");
                    int english = scanner.nextInt();
                    System.out.println("수학: ");
                    int math = scanner.nextInt();

                    scoreService.addScore(name, korean, english, math);
                    System.out.println("입력 완료");
                    break;
                case 2:
                    //getAllScores();
                    List<ScoreDTO> scores = scoreService.getAllScores();

                    // 리스트가 비어있으면 true 반환
                    if (scores.isEmpty()) {
                        System.out.println("저장된 학생 점수가 없습니다.");
                    } else {
                        // 1) 일반 for문
//                    for (int i = 0; i < scores.size(); i++) {
//                        ScoreDTO scoreDTO = scores.get(i);
//                        System.out.println(scoreDTO);
//                    }
                        // 2) for each
                        // 모든 학생 점수 리스트가 저장된 scores에서 순차적으로 꺼내 출력
                        for (ScoreDTO score : scores) {
                            System.out.println(score);
                        }
                    }

                    break;
                case 3:
                    //getStudentCount();
                    //System.out.println("전체 등록된 학생의 수는 " + scoreService.getScoresCounts() + "명입니다.");

                    scores = scoreService.getAllScores();
                    System.out.println("전체 등록된 학생의 수는 " + scores.size() + "명입니다.");
                    break;
                case 4:
                    //analyze();
                    scores = scoreService.getAllScores();
                    if (scores.isEmpty()) {
                        System.out.println("저장된 학생 정보가 없습니다.");
                    } else {
                        // 최고 총점
                        int maxTotalScore = scoreService.getMaxTotalScore();
                        System.out.println("최고 총점: " + maxTotalScore);

                        // TODO: 최저 총점
                        int minTotalScore = scoreService.getMinTotalScore();
                        System.out.println("최저 총점: " + minTotalScore);

                        // 총점들의 평균
                        double totalScoreAverage = scoreService.getTotalScoreAverage();
                        //System.out.println("총점 평균: " + totalScoreAverage);
                        System.out.printf("총점 평균: %.2f\n", totalScoreAverage);
                    }
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("숫자만 입력해 주세요.");
            }
        }
    }
}

