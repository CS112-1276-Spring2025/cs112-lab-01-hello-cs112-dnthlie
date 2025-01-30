public class Shoes {
    private String brand;

    /* DEFAULT CONSTRUCTOR
     *
     */
    public Shoes() {
        this.brand = "Unknown";
    }
    
    /* FULL CONSTRUCTOR
     * @param brand
     */
    public Shoes(String brand) {
        this.brand = brand;
    }

    /* GETTERS
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /* SETTERS
     * @param brand
     */ 
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /* ToString METHOD
     *
     */
    @Override
    public String toString() {
        return "Brand name: " + brand;
    }

    /* EQUALS METHOD
     * @param obj
     * @return equals true/false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Shoes shoes = (Shoes) obj;
        return this.brand.equals(shoes.brand);
    }

}