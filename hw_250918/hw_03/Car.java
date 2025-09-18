package hw_250918.hw_03;

public class Car implements Vehicle {
    private int speed; // 속도(speed)는 private

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("자동차가 이동합니다.");
    }

    // 반드시 set/get 메서드로만 조작할 수 있다.
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
