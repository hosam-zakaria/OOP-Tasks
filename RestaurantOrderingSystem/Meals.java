package ProjectOne;

public abstract class Meals {
    private String name; 
    private double basePrice; 

    public Meals(String name, double basePrice){
        this.name = name; 
        this.basePrice = basePrice; 
    }
    public abstract double calculatePrice();

    public String getName(){
        return name;
    }

    public double getBasePrice(){
        return basePrice;
    }
    /*
    Composition : 
    Order Has a Meals 
    Order Has a Customer
    */
}
