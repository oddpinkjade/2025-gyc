package hw_251002.youtube;

import java.util.List;

public class VideoService {

    private final VideoDAO videoDAO;

    public VideoService(VideoDAO videoDAO) {
        this.videoDAO = videoDAO;
    }

    public List<Video> getAllVideos() {
        return videoDAO.findAll();
    }
}
