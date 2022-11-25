public class Cafe{
  public static void main(String[] args){
            // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Felix, ";
        String firstOrder = "What will you have today?";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double caramelPrice = 4.5;
        double pumpkinPrice = 5.5;
        double rasberryPrice = 5.5;
        double twoOrders = rasberryPrice + pumpkinPrice;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Cindy";
        String customer3 = "Carl";
        String customer4 ="Jimmy";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
      System.out.println(customer1 + " Would like a caramel coffee, which will be $" + caramelPrice );



        if(isReadyOrder1){
          System.out.println(customer1 + " You're order is still being prepared!");
        }
        else if(isReadyOrder1 == ){
          System.out.println("You're order is ready! " + customer1 + " That will be $" + (mochaPrice + caramelPrice) );
        }
        else {
          System.out.println("I Think i made a mistake with my order!");
        }



    }
  }
