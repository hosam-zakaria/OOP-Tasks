package ProjectOne;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Meals> meals;


    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Meals> getMeals() {
        return meals;
    }
    public Order(Customer customer){
        this.customer = customer;
        meals = new ArrayList<>();
    }

    public void addMeal(Meals meal){
        meals.add(meal);
    }
}
