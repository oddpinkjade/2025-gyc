package hw_250919.vetpatientmanagement;

import java.util.List;

public class PatientService {

    private final PatientDao patientDao;

    public PatientService(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    public boolean addPatient(String id, String guardianName, String petName, int petAge, String contact) {
        if (patientDao.existsById(id)) {
            // throw new IllegalArgumentException("이미 등록된 환자 ID입니다.");
            return false;
        }
        Patient patient = new Patient(id, guardianName, petName, petAge, contact);
        patientDao.save(patient);
        return true;
    }

    public List<Patient> getAllPatients() {
        return patientDao.findAll();
    }
}
