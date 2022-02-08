public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 15.2;
        double lattePrice = 4.5;
        double cappuccinoPrice = 25.5;

        


    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        	// ** Your customer interaction print statements will go here ** //
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
            if (isReadyOrder1) {
                System.out.println(readyMessage); 
             } else {
                System.out.println(pendingMessage);
            } 
                
        //Noah ordered a cappuccino

        System.out.println(generalGreeting + customer4); 
        if (isReadyOrder4) {
            System.out.println(displayTotalMessage + cappuccinoPrice); 
         } else {
            System.out.println(pendingMessage);
        } 

        //Sam just ordered 2 lattes

        System.out.println(generalGreeting + customer2); 
        if (isReadyOrder2) {
            System.out.println(displayTotalMessage + 2*(lattePrice)); 
         } else {
            System.out.println(pendingMessage);
        } 


        //Jimmy just realized he was charged for a coffee but had ordered a latte

        System.out.println(generalGreeting + customer3); 
        if (isReadyOrder3) {
            System.out.println(displayTotalMessage + (dripCoffeePrice - lattePrice )); 
         } else {
            System.out.println(pendingMessage);
        } 

    }
}