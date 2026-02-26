import java.util.Scanner;
class Patient {
    String name;
    int age;
    String disease;
    Patient(String a, int b, String c) {
        this.name = a;
        this.age = b;
        this.disease = c;
    }
    void display() {
        System.out.println("Patient Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
    }
    public static void main(String[] args) {
        HospitalManagement.main(args);
    }
}
class Doctor {
    String name;
    String specialization;
    Doctor(String a, String b) {
        this.name = a;
        this.specialization = b;
    }
    void display() {
        System.out.println("Doctor Name        : " + name);
        System.out.println("Specialization     : " + specialization);
    }
}
class Pharmacy {
    String medicineName;
    int price;
    Pharmacy(String a, int b) {
        this.medicineName = a;
        this.price = b;
    }
    void display() {
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Price         : " + price);
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Patient Details");
        System.out.print("Enter Patient Name     : ");
        String pname = S.nextLine();
        System.out.print("Enter Age              : ");
        int age = S.nextInt();
        S.nextLine();
        System.out.print("Enter Disease          : ");
        String disease = S.nextLine();
        Patient pt = new Patient(pname, age, disease);
        System.out.println("\nEnter Doctor Details");
        System.out.print("Enter Doctor Name      : ");
        String dname = S.nextLine();
        System.out.print("Enter Specialization   : ");
        String spec = S.nextLine();
        Doctor dr = new Doctor(dname, spec);
        System.out.println("\nEnter Pharmacy Details");
        System.out.print("Enter Medicine Name    : ");
        String med = S.nextLine();
        System.out.print("Enter Price            : ");
        int price = S.nextInt();
        Pharmacy ph = new Pharmacy(med, price);
        System.out.println("\n----Hospital Details----\n");
        pt.display();
        dr.display();
        ph.display();
        S.close();
    }
}