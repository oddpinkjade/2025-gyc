package hw_250923.score;

import java.util.ArrayList;
import java.util.List;

// 데이터 저장 및 조회.
// Service에 데이터 제공.
public class ScoreDAO {

    // 학생 한 명의 데이터를 받아 리스트에 추가
    private List<ScoreDTO> scores = new ArrayList<>();

    // 학생 한 명의 정보를 DTO로부터 전달받아 리스트에 추가
    public void save(ScoreDTO score){
        scores.add(score);
    }

    // 저장된 전체 학생 목록 호출
    public List<ScoreDTO> findAll(){
        return List.copyOf(scores); // 호출한 곳으로 반환
    }

    public int count(){
        return scores.size();
    }
}

