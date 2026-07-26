package ProjectOne;

public class Burger extends Meals {

    public Burger(String name, double basePrice){
        super(name, basePrice);
    }
    @Override
    public double calculatePrice(){
        return getBasePrice();
    }
}
