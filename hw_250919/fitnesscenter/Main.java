package hw_250919.fitnesscenter;

public class Main {

    public static void main(String[] args) {
        FitnessMemberDao dao = new FitnessMemberDao();
        FitnessMemberService service = new FitnessMemberService(dao);
        FitnessMemberController controller = new FitnessMemberController(service);
        controller.run();
    }
}
