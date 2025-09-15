package hw_250915;

import java.util.Scanner;

// 6. 점수(0~100)를 입력받아 "A/B/C/D/F" 등급을 문자열로 반환하는 메서드
public class ScoreToGradeConverter {

    private static final int MIN_SCORE = 0;
    private static final int MAX_SCORE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        String grade = convertScoreToGrade(score);
        System.out.println("성적: " + grade);

        scanner.close();
    }

    private static void validateScore(int score) {
        if (score < MIN_SCORE || score > MAX_SCORE) {
            throw new IllegalArgumentException("점수는 0에서 100 사이여야 합니다. 입력값: " + score);
        }
    }

    private static String convertScoreToGrade(int score) {
        validateScore(score);
//        if (score >= 90) {
//            return "A";
//        } else if (score >= 80) {
//            return "B";
//        } else if (score >= 70) {
//            return "C";
//        } else if (score >= 60) {
//            return "D";
//        } else {
//            return "F";
//        }
        switch (score / 10) {
            case 10:
            case 9:  return "A";
            case 8:  return "B";
            case 7:  return "C";
            case 6:  return "D";
            default: return "F";
        }
    }
}
