package hw_250919.vetpatientmanagement;

public class Patient {

    private String id;
    private String guardianName;
    private String petName;
    private int petAge;
    private String contact;

    public Patient(String id, String guardianName, String petName, int petAge, String contact) {
        this.id = id;
        this.guardianName = guardianName;
        this.petName = petName;
        this.petAge = petAge;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + guardianName + '\'' +
                ", petName='" + petName + '\'' +
                ", petAge='" + petAge + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
