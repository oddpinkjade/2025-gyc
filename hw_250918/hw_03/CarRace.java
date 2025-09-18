package hw_250918.hw_03;

public class CarRace {

    public static void main(String[] args) {
        Car car = new Car(20); // move 전에 속도를 설정하고
        car.move();
        System.out.println("자동차 속도: " + car.getSpeed());

        System.out.println();

        Bicycle bicycle = new Bicycle(10);
        bicycle.move();
        System.out.println("자전거 속도: " + bicycle.getSpeed());
    }
}
