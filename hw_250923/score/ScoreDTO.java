package hw_250923.score;

/*
 * 요구사항
 * 학생 점수 관리 프로그램
 * 국어, 영어, 수학, 총점, 평균, 학점
 */
public class ScoreDTO {

    private String name;
    private int korean, english, math;
    private int total;
    private double average;
    private String grade;

    public ScoreDTO() {}

    public ScoreDTO(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public String getGrade() {
        return grade;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ScoreDTO{" +
                "이름='" + name + '\'' +
                ", 국어=" + korean +
                ", 영어=" + english +
                ", 수학=" + math +
                ", 총점=" + total +
                ", 평균=" + String.format("%.2f", average) +
                ", 학점='" + grade + '\'' +
                '}';
    }
}

/*
 * String.format("%.2f", avg); // 평균값을 소수점 둘째 자리까지 반올림해서 문자열로 변환
 * String.format("%d", total); // 정수
 * String.format("%s", name);  // 문자열
 */
