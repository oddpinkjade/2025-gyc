package hw_250916;

// K팝 케데헌 아이돌 멤버의 이름, 포지션, 그룹 등등을 저장하는 Idol 클래스 생성
public class Idol {

    private String name;
    private String position;
    private String group;

    public Idol(String name, String position, String group) {
        this.name = name;
        this.position = position;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getGroup() {
        return group;
    }
}
