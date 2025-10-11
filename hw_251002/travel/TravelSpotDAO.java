package hw_251002.travel;

import hw_251002.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TravelSpotDAO {

    public List<TravelSpot> findBySeason(Season seasonInput) {
        String sql = "select * from travel_spots where season = ? and rating >= 4.5";
        List<TravelSpot> results = new ArrayList<>();

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, seasonInput.name());

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Long id = resultSet.getLong("id");
                    String name = resultSet.getString("name");
                    String location = resultSet.getString("location");
                    double rating = resultSet.getDouble("rating");
                    Season season = Season.valueOf(resultSet.getString("season"));

                    results.add(new TravelSpot(id, name, location, season, rating));
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("추천 여행지 조회 실패", e);
        }

        return results;
    }
}
