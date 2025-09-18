package hw_250918.hw_04;

public class Person {

    // 마을 주민(Person) 5명의 이름과 나이는 비공개입니다.
    // Person 클래스, 이름(name), 나이(age)는 모두 private.
    private String name;
    private int age;

    // set/get 메서드로만 정보를 입력·확인할 수 있다.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
