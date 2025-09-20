package hw_250919.fitnesscenter;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class FitnessMemberDao {

    private final List<FitnessMember> fitnessMembers = new ArrayList<>();

    public void save(FitnessMember fitnessMember) {
        fitnessMembers.add(fitnessMember);
    }

    public List<FitnessMember> findAll() {
        //return fitnessMembers;
        //return new ArrayList<>(fitnessMembers); // 방어적 복사
        //return Collections.unmodifiableList(fitnessMembers); // 불변 리스트 반환
        return List.copyOf(fitnessMembers); // 불변 리스트 반환
    }

    public boolean existsById(int memberId) {
        return fitnessMembers.stream()
                .anyMatch((m -> m.getMemberId() == memberId));
    }
}
