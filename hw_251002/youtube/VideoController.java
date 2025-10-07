package hw_251002.youtube;

import static utils.InputUtils.readInt;

import java.util.List;

public class VideoController {

    private static final int MIN_COMMAND_VALUE = 0;
    private static final int MAX_COMMAND_VALUE = 1;

    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    public void run() {
        while (true) {
            printMenu();
            int command = readInt("번호 입력: ");

            switch (command) {
                case 1:
                    getAllVideos();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.printf("%d~%d 사이의 숫자만 입력하세요.%n", MIN_COMMAND_VALUE, MAX_COMMAND_VALUE);
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== 유튜브 영상 관리 프로그램 =====");
        System.out.println("1. 유튜브 영상 전체 조회");
        System.out.println("0. 프로그램 종료");
    }

    private void getAllVideos() {
        List<Video> allVideos = videoService.getAllVideos();
        if (allVideos.isEmpty()) {
            System.out.println("등록된 영상이 없습니다.");
            return;
        }


        System.out.println("\n[영상 목록]");
        System.out.printf(Video.PRINT_FORMAT + "\n",
                "번호", "제목", "채널", "업로드 날짜", "조회수", "좋아요");
        for (Video video : allVideos) {
            System.out.println(video);
        }
    }
}
