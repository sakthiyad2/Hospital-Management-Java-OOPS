package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HospitalManagement hospital = new HospitalManagement();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Patient Details");
            System.out.print("Enter Patient Name     : ");
            String pname = scanner.nextLine();
            System.out.print("Enter Age              : ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Disease          : ");
            String disease = scanner.nextLine();
            System.out.print("Enter CPF              : ");
            String cpf = scanner.nextLine();
            
            Patient pt = new Patient(pname, age, disease, cpf);
            hospital.addPatient(pt); 

            System.out.println("\nEnter Doctor Details");
            System.out.print("Enter Doctor Name      : ");
            String dname = scanner.nextLine();
            System.out.print("Enter Specialization   : ");
            String spec = scanner.nextLine();
            System.out.print("Enter CRM              : ");
            String crm = scanner.nextLine();
            
            Doctor dr = new Doctor(dname, spec, crm);
            hospital.addDoctor(dr); 

            System.out.println("\nEnter Pharmacy Details");
            System.out.print("Enter Medicine Name    : ");
            String med = scanner.nextLine();
            System.out.print("Enter Price            : ");
            double price = scanner.nextDouble();
            System.out.print("Enter ID               : ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            
            Pharmacy ph = new Pharmacy(med, price, id);
            hospital.addPharmacy(ph); 

            System.out.println("\n----Hospital Details----\n");
            System.out.println(pt);
            System.out.println("\n------------------------");
            System.out.println(dr);
            System.out.println("\n------------------------");
            System.out.println(ph);
        }
    }
}