

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FuelCostCalculator {

	private static int i;

	public static void main(String[] args) {
        double distance = 0.0;
        double mpg = 0.0;
		String carInfo = null;
		int userInput = 0;
		int resetInput = 0;
		
        final double GAS_PRICE = 3.75;

        //establishes user input 
        Scanner input = new Scanner(System.in);
        
        
        //do-while loop that asks the user to restart the program
      //Requirement 3 - Another Loop
        do {
        	  
            //UI
            //Requirement 8 - Add another feature you want to include that is not on this requirement list
        	userInput = Integer.parseInt(JOptionPane.showInputDialog("                                Welcome to Fuel Calculator!\nThis app will calculate the fuel amount and the cost for any road trip.\nPlease select your car\n"
        			+ "1 - Honda\n"
    				+ "2 - Toyota\n"
    				+ "3 - Ford\n"
    				+ "4 - Kia\n"
    				+ "5 - Nissan"));
        	
	        	
				//takes user input and assigns it to the value of the userInput variable
        	    //also captures user's car selection as caraInfo variable
				switch(userInput)
				{
				case 1:
					carInfo = "Honda";
					break;
				case 2:
					carInfo = "Toyota";
					break;
				case 3:
					carInfo = "Ford";
					break;
				case 4:
					carInfo = "Kia";
					break;
				case 5:
					carInfo = "Nissan";
					break;
				}//end of switch
				
	        	while((userInput > 5) || (userInput < 1)) //user validation loop
	        	{        		
	       		userInput = Integer.parseInt(JOptionPane.showInputDialog("                         ERROR!\nPlease type 1-5 to select your car\n"
	            			+ "1 - Honda\n"
	        				+ "2 - Toyota\n"
	        				+ "3 - Ford\n"
	        				+ "4 - Kia\n"
	        				+ "5 - Nissan"));
	            	
	    				switch(userInput)
	    				{
	    				case 1:
	    					carInfo = "Honda";
	    					break;
	    				case 2:
	    					carInfo = "Toyota";
	    					break;
	    				case 3:
	    					carInfo = "Ford";
	    					break;
	    				case 4:
	    					carInfo = "Kia";
	    					break;
	    				case 5:
	    					carInfo = "Nissan";
	    					break;
	    				}//end of switch		
	        	}//end of while user validation loop
	        	
	        //user's prompt to select gallons or liters	
             System.out.println("Enter 1 to receive the results in gallons");
             System.out.println("Enter 2 to receive the results in liters");
             userInput = input.nextInt();
             
           
                //prompt that asks users to input data in miles or kilometer 
             //Requirement 1 - Compound Condition
             //Requirement 2- Error Validation Loop
	        	while (!(userInput == 1) && !(userInput == 2)) { //input validation
	        		System.out.println("Error! Please enter the number '1' or '2'");
	        		userInput = input.nextInt();
	        		
	        	}//while
	        	
	        	 if (userInput == 1) 
	  	        {	
	  	        	// miles per gallon
	  	        	System.out.println("How many miles are you going to drive?"); 
	  	        //	 distance = input.nextInt();
	  	        	 distance = input.nextDouble();
	  	        	
	  	        	while ((!(distance > 1))) //input validation
	  	        	{
	  	        		
	  	        		System.out.println("Error! Please enter a number above 0");
	  	        	//	distance = input.nextInt();
	  	        		 distance = input.nextDouble();
	  	        	}//end of while-distance validation
	  	        	
	  	        	System.out.println("Whats your car's MPG?");
	  	        //	mpg = input.nextInt();
	  	        	mpg = input.nextDouble();
	  	        	
	  	        	while ((!(mpg > 1))) //input validation
	  	        	{
	  	        		System.out.println("Error! Please a number above 0");
	  	        //		mpg = input.nextInt();
	  	        		mpg = input.nextDouble();
	  	        	}//end of while-mpg validation
	  	               
	  	        	//calculation formula
	  	        	//Fuel cost = (Distance / Consumption) × Cost per gallon
	  	        	double fuelCost = (distance/mpg) * GAS_PRICE;
	  	            double fuelNeeded = (distance/mpg);
	  	            
	  	          //Requirement 4 - Abbreviated Incriminator 
	  	            //prints "." 3 times with delay of 1000 milliseconds (1 second) each print and creates a loading promt
	  	        	System.out.print("Calculating");
	  			 	for(i = 0; i < 3; i++)
	  			 	{
	  			 		System.out.print(".");
		
	  			 		try {
	  						Thread.sleep(1000);
	  					} catch (InterruptedException e) {
	  						e.printStackTrace();
	  					}		
	  			 	}//end of counter for loop
	  			 	System.out.println("");
	  	            
	  	          //generates random #numbers of users
	  	        	int random = (int)(Math.random() * 100 + 80);
	  	        	
	  	          //output
	  	        	System.out.println("\nFor your " + carInfo + "," + " the fuel amount required to drive " + distance + " miles" + ":");
	  	        	System.out.printf("%.2f gallons%n", fuelNeeded);
	  	        	System.out.println("It will cost:");
	  	        	System.out.printf("$%.2f \n", fuelCost);
	  	        	
	  	        	System.out.println("\nThe number of users have used this app: " + random);
	  	        } 
	  	        else if (userInput == 2) 
	  	        {
	  	        	// km per liter
	  	        	System.out.println("How many kilometers are you going to drive?"); 
	  	        //  distance = input.nextInt();
	  	        	distance = input.nextDouble();
		  	          while ((!(distance > 1))) //input validation
		  	        	{
		  	        		
		  	        		System.out.println("Error! Please enter a number above 0");
		  	      //  		distance = input.nextInt();
		  	        		distance = input.nextDouble();
		  	        	}//end of while-distance validation
	  	        	
	  	            System.out.println("Whats your car's MPG?");
	  	         //   mpg = input.nextInt();
	  	              mpg = input.nextDouble();
		  	          while ((!(mpg > 1))) //input validation
		  	        	{
		  	        		System.out.println("Error! Please enter a number above 0");
		  	      //  		mpg = input.nextInt(); 
		  	        		mpg = input.nextDouble();
		  	        	}//end of while-mpg validation
	  	         
	  	         //Requirement 7 - Comment your codes
	  	           // Convert MPG to KPL. 1 miles per gallon = 0.425144 kilometer per liter 
	  	           //Divide the gas price (per U.S. gallon) by the number of liters in a gallon. 1 gallon = 3.785 liter. The result is the gas price per liter.
	  	         
	  	        	double fuelCost = ((distance)/(mpg * 0.425144)) * ((GAS_PRICE / 3.785)); // $per liter
	  	        	double fuelNeeded = (distance /(mpg * 0.425144)); // _liters
	  	        	
	  	        //Requirement 4 - Abbreviated Incriminator 
	  	        	System.out.print("Calculating");
	  			 	for(i = 0; i < 3; i++)
	  			 	{
	  			 		System.out.print(".");	
	  			 		
	  			 		try {
	  						Thread.sleep(1000);
	  					} catch (InterruptedException e) {
	  						e.printStackTrace();
	  					} 		
	  			 	}
	  			 	System.out.println("");
	  	        
	  	        	int random = (int)(Math.random() * 500 + 50); //generates random number to display #num of users
	  	        
	  	        	System.out.println("\nFor your " + carInfo + "," + " the fuel amount required to drive " + distance + " kilometers" + ":");
	  	        	System.out.printf("%.2f liters%n", fuelNeeded);
	  	        	System.out.println("It will cost:");
	  	        	System.out.printf("$%.2f \n", fuelCost);
	  	        	
	  	        	System.out.println("\nThe number of users have used this app: " + random);
	  	        } 
	  	        else //input validation 
	  	        {
	  	        	System.out.println("ERROR! Please input only 1 or 2");
	  	        }//end of if/else statement
	        	
	        	//prompt to restart the program
	        	 resetInput = JOptionPane.showConfirmDialog(null, "Would you like to start a new calculation?");
	        	 
	        	 
	        	//System.out.println("press 1 to start a new calculation or press 2 to exit");
	        	//resetInput = input.nextInt();
		        /*while (!(resetInput == 0) && (!(resetInput == 2)))//input validation
		        {
		        	
		        	System.out.println("Please input '1' to continue or '2' exit");
		        	resetInput = input.nextInt();
		        }*/
		       
	        	  
        } while(resetInput == 0);//end of do-while loop 
        
        //program closing message
        System.out.println("\nThank you for using Fuel Cost Calculator!"); 

	}

}
