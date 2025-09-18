package hw_250918.hw_04;

public class Village {

    public static void main(String[] args) {
        // 5명의 Person 객체 배열을 만들어
        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
        }

        // set 메서드로 값 저장
        people[0].setName("소령");
        people[0].setAge(15);

        people[1].setName("효정");
        people[1].setAge(20);

        people[2].setName("채연");
        people[2].setAge(26);

        people[3].setName("건우");
        people[3].setAge(26);

        people[4].setName("정민");
        people[4].setAge(16);

        // get 메서드로 출력
        System.out.println("[마을 주민 목록]");
        for (int i = 0; i < people.length; i++) {
            System.out.println((i + 1) + "번 주민 - 이름: " + people[i].getName()
                    + ", 나이: " + people[i].getAge() + "세");
        }
    }
}
