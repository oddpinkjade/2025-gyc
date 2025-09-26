package hw_250919.vetpatientmanagement;

import static utils.InputUtils.readInt;
import static utils.InputUtils.readLine;

import java.util.List;

public class PatientController {

    private final int MIN_COMMAND_VALUE = 0;
    private final int MAX_COMMAND_VALUE = 2;

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    public void run() {
        while (true) {
            printMenu();
            int command = readInt("번호 입력: ");

            switch (command) {
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                case 1:
                    addPatient();
                    break;
                case 2:
                    getAllPatients();
                    break;
                default:
                    System.out.printf("%d~%d 사이의 숫자만 입력하세요.%n", MIN_COMMAND_VALUE, MAX_COMMAND_VALUE);
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== 동물 병원 환자 관리 시스템 =====");
        System.out.println("1. 환자 등록");
        System.out.println("2. 전체 환자 조회");
        System.out.println("0. 종료");
    }

    private void addPatient() {
        String id = readLine("환자 ID: ");
        String guardianName = readLine("보호자 이름: ");
        String petName = readLine("반려동물 이름: ");
        int petAge = readInt("반려동물 나이: ");
        String contact = readLine("연락처: ");

        boolean result = patientService.addPatient(id, guardianName, petName, petAge, contact);
        if (result) {
            System.out.println("환자 등록 완료");
        } else {
            System.out.println("이미 등록된 환자입니다.");
        }
    }

    private void getAllPatients() {
        List<Patient> allPatients = patientService.getAllPatients();
        if (allPatients.isEmpty()) {
            System.out.println("등록된 환자가 없습니다.");
            return;
        }

        System.out.println("\n[전체 환자 목록]");
        for (Patient patient : allPatients) {
            System.out.println(patient);
        }
    }
}
