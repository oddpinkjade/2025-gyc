package hw_251002.youtube;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VideoDAO {

    public List<Video> findAll() {
        String sql = "select * from videos";
        List<Video> videos = new ArrayList<>();

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String title = resultSet.getString("title");
                String channel = resultSet.getString("channel");
                LocalDateTime uploadDate = resultSet.getTimestamp("upload_date").toLocalDateTime();
                Integer views = resultSet.getInt("views");
                Integer likes = resultSet.getInt("likes");

                Video video = new Video(id, title, channel, uploadDate, views, likes);
                videos.add(video);
            }

        } catch (SQLException e) {
            throw new RuntimeException("전체 영상 목록 조회 실패: " + sql, e);
        }

        return videos;
    }
}
