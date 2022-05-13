import java.util.ArrayList;

public class CafeUtil {

    // method that will control the streak goal section of this code. 
    public int getStreakGoal() {
        int sum = 0;
        for(int week = 1; week <= 10; week++) {
            sum+= week;
        }
        return sum;
    }

    // method that returns the order total through whatever process is given. 
    public double  getOrderTotal(double[] lineItems) {
        double sum = 0;

        for (double price: lineItems) {
            sum+= price;
        }
        return sum;
    }

    //Displaying the coffee menu to the customer. 
    public void displayMenu(ArrayList<String> menuItems) {
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s \n", id, menuItems.get(id));
        }
    }

    // adding a customer to our order/database
    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("Enter your name here:");
        String userName = System.console().readLine();
        System.out.printf("Welcome, %s. ", userName);
        System.out.printf("There is %s customer(s) ahead of you.\n", customerList.size());
        customerList.add(userName);
        System.out.println(customerList);
    }
}