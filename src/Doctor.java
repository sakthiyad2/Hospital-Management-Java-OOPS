package src;

public class Doctor {
    private String name;
    private String specialization;
    private String crm;

    public Doctor(String name, String specialization, String crm) {
        this.name = name;
        this.specialization = specialization;
        this.crm = crm;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nSpecialization: " + specialization;
    }
}
