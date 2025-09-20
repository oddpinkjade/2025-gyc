package hw_250919.vetpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class PatientDao {

    private final List<Patient> patients = new ArrayList<>();

    public void save(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> findAll() {
        return List.copyOf(patients); // 불변 리스트 반환
    }

    public boolean existsById(String id) {
        return patients.stream()
                .anyMatch(i -> i.getId().equals(id));
    }
}
