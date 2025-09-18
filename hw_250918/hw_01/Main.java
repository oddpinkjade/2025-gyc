package hw_250918.hw_01;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setPassword("abc123");
        System.out.println("내 비밀번호는 " + user.getPassword());
    }
}
