package hw_250918.hw_04;

public class Village {

    private static final int RESIDENT_COUNT = 5;

    public static void main(String[] args) {

        String[] names = {"소령", "효정", "채연", "건우", "정민"};
        int[] ages = {15, 20, 26, 26, 16};

        // 5명의 Person 객체 배열을 만들어
        Person[] people = new Person[RESIDENT_COUNT];

        for (int i = 0; i < RESIDENT_COUNT; i++) {
            people[i] = new Person();
            // set 메서드로 값 저장
            people[i].setName(names[i]);
            people[i].setAge(ages[i]);
        }

        // get 메서드로 출력
        System.out.println("[마을 주민 목록]");
        for (int i = 0; i < RESIDENT_COUNT; i++) {
            System.out.printf("%d번 주민 - 이름: %s, 나이: %d세%n",
                    i + 1, people[i].getName(), people[i].getAge());
        }
    }
}
