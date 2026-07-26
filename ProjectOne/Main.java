package ProjectOne; 

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Hosam : "); 
        Order order = new Order(customer);

        order.addMeal(new Burger("Beef Burger", 100));
        order.addMeal(new Burger("Base Burger", 80));
        order.addMeal(new Pizza("Chicken Pizza", 150));
        order.addMeal(new Seafood("Shrimp", 200));

        Restaurant restaurant = new Restaurant();
        restaurant.printOrder(order);
    } 
}