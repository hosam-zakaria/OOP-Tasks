package ProjectOne;

public class Seafood extends Meals{
    
    public Seafood(String name, double basePrice){
        super(name, basePrice); 
    }

    @Override
    public double calculatePrice(){
        return getBasePrice() + 50; 
    }
}
