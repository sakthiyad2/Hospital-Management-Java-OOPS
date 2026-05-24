package src;

import java.util.HashMap;
import java.util.Map;

public class HospitalManagement {
    private Map<String, Patient> patients;
    private Map<String, Doctor> doctors;
    private Map<Integer, Pharmacy> pharmacies;

    public HospitalManagement(){
        this.patients = new HashMap<>();
        this.doctors = new HashMap<>();
        this.pharmacies = new HashMap<>();
    }

    public void addPatient(Patient patient){
        this.patients.put(patient.getCpf(), patient);
    }

    public void addDoctor(Doctor doctor){
        this.doctors.put(doctor.getCrm(), doctor);
    }

    public void addPharmacy(Pharmacy pharmacy){
        this.pharmacies.put(pharmacy.getId(), pharmacy);
    }

    public void removePatient(String cpf){
        this.patients.remove(cpf);
    }

    public void removeDoctor(String crm){
        this.doctors.remove(crm);
    }

    public void removePharmacy(int id){
        this.pharmacies.remove(id);
    }

    public Patient searchPatient(String cpf){
        return this.patients.get(cpf);
    }

    public Doctor searchDoctor(String crm){
        return this.doctors.get(crm);
    }

    public Pharmacy searchPharmacy(int id){
        return this.pharmacies.get(id);
    }
}
