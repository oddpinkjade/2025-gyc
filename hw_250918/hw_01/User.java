package hw_250918.hw_01;

/*
    비밀번호를 private 변수로 만들고, set/get 메서드로만 값을 바꿀 수 있다.
    누가 내 비밀번호를 바꾸고 확인하려면 반드시 메서드를 이용해야 한다
*/
public class User {

    private String password;

    public User() {}

    public User(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
