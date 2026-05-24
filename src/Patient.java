package src;

public class Patient {
    private String name;
    private String cpf;
    private int age;
    private String disease;
    
    public Patient(String name, int age, String disease, String cpf) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nDisease: " + disease;
    }
}
