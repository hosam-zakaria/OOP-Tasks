package ProjectOne;

public class Pizza extends Meals{
    public Pizza(String name, double basePrice){
        super(name, basePrice);
    }

    @Override
    public double calculatePrice(){
        return getBasePrice() + 20;
    }
}
