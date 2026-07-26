package ProjectOne;

public class Restaurant {
    
    public void printOrder(Order order){    
        System.out.println("Order for " + order.getCustomer().getName());

        int total = 0; 
        for(Meals meal : order.getMeals()){
            total += meal.calculatePrice(); 
            System.out.println(meal.getName() + " : " + meal.calculatePrice() + " EGP");
        }

        System.out.println("----------------");
        System.out.print("Total Order : " + total + " EGP");
    }   
}
