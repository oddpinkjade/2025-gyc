package hw_251002.youtube;

public class Main {

    public static void main(String[] args) {
        VideoDAO videoDAO = new VideoDAO();
        VideoService videoService = new VideoService(videoDAO);
        VideoController videoController = new VideoController(videoService);
        videoController.run();
    }
}
