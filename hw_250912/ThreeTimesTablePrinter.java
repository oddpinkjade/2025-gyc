package hw_250912;

// 과제 5: 구구단의 3단 출력
public class ThreeTimesTablePrinter {

    public static void main(String[] args) {
        printThreeTimesTable();
    }

    private static void printThreeTimesTable() {
        int base = 3;
        for (int i = 1; i <= 9; i++) {
            System.out.println(base + " x " + i + " = " + (base * i));
        }
    }
}
