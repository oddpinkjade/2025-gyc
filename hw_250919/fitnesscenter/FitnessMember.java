package hw_250919.fitnesscenter;

public class FitnessMember {

    private int memberId;
    private String memberName;
    private int baseCalorie;
    private int consumedCalorie;

    public FitnessMember(int memberId, String memberName, int baseCalorie, int consumedCalorie) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.baseCalorie = baseCalorie;
        this.consumedCalorie = consumedCalorie;
    }

    public int getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return "FitnessMember{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", baseCalorie=" + baseCalorie +
                ", consumedCalorie=" + consumedCalorie +
                '}';
    }
}
