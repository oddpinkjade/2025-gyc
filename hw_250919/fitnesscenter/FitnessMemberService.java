package hw_250919.fitnesscenter;

import java.util.List;

public class FitnessMemberService {

    private final FitnessMemberDao fitnessMemberDao;

    public FitnessMemberService(FitnessMemberDao fitnessMemberDao) {
        this.fitnessMemberDao = fitnessMemberDao;
    }

    public boolean addFitnessMember(String name, int memberId, int baseCalorie, int consumeCalorie) {
        if (fitnessMemberDao.existsById(memberId)) {
            // 불리언 값 리턴 대신 예외 처리를 하면 좋을 것이라 생각
            // throw new IllegalArgumentException("이미 등록된 회원 ID입니다.");
            return false;
        }
        FitnessMember fitnessMember = new FitnessMember(memberId, name, baseCalorie, consumeCalorie);
        fitnessMemberDao.save(fitnessMember);
        return true;
    }

    public List<FitnessMember> getAllFitnessMembers() {
        return fitnessMemberDao.findAll();
    }
}
