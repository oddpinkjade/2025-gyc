package hw_250919.vetpatientmanagement;

public class Main {

    public static void main(String[] args) {
        PatientDao dao = new PatientDao();
        PatientService service = new PatientService(dao);
        PatientController controller = new PatientController(service);
        controller.run();
    }

}
