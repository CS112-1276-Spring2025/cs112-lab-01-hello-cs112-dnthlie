public class Shoes {
    private String brand;

    //DEFAULT CONSTRUCTOR
    public Shoes() {
        this.brand = "Unknown";
    }

    //FULL CONSTRUCTOR
    public Shoes(String brand) {
        this.brand = brand;
    }

    //GETTERS
    public String getBrand() {
        return brand;
    }

    //SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //ToString METHOD
    @Override
    public String toString() {
        return "Brand name: " + brand;
    }

    //EQUALS METHOD
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Shoes shoes = (Shoes) obj;
        return this.brand.equals(shoes.brand);
    }

}