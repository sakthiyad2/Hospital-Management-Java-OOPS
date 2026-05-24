package src;

public class Pharmacy {
    private int id;
    private String medicineName;
    private double price;

    public Pharmacy(String medicineName, double price, int id) {
        this.medicineName = medicineName;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nMedicine: " + medicineName + "\nPrice: $" + String.format("%.2f", price);
    }
}
