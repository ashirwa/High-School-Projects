/*
START program
CALL upon grade method 
CREATE variables
INTRODUCE the code
ADD extra spaces for neatness
ASK user for which class they would want to use it for
STORE answer
INTRODUCE the next part
ASK user for 4 category weightings 
STORE answers
CREATE "second chances" in case the categories do not add up to 100%
INTRODUCE the next part of the code
ASK user to input marks from the assignment itself
ADD try and catches, alongside with if/else statements per each category
STORE answers
CREATE a equation calculating the average mark, including the weightings and percentages
CREATE a doubleArray, with 4 values including the percentages from the assignment
USE array.sort, and sort from lowest to highest
ADD thread.sleep to create comedic and delay effect
PRINT lowest - highest percentage overall
PRINT average grade
END program
*/

import java.util.*;
import java.io.*;


public class Summative{

	public static void main (String [] args){
		//calling upon method "grade"
		grade();
	}			

	//creating a new method to reduce flowchart
	public static void grade (){

		//initializing variables
		Scanner userInput = new Scanner (System.in);
		boolean flag = true;
		boolean flag2 = true;
		boolean flag3 = true;
		double mark;
		double knowledge = 0;
		double communication = 0;
		double application = 0;
		double thinking = 0;
		String option;
		double decimalk = 0;
		double decimalc = 0;
		double decimala = 0;
		double decimalt = 0;
		String course;
		double kweight = 0;
		double cweight = 0;
		double tweight = 0;
		double aweight = 0;

		//created while loop to restart program if user wanted to
		while (flag2){

			//clears the terminal
			System.out.print("\033[H\033[2J\033[H\033[2J");
			//introduction to the assignment
			System.out.println ("Welcome to the Grade Calculator! Today, you will be inputting various grades for each of your classes, creating a series of assignments overall. Good luck!");
			//extra space for neatness
			System.out.println("");	
			System.out.println("");	
			System.out.println("For more information, make sure to check the ReadMe.txt file directed in your downloads (assuming that you access this code from there)");	
			//asking user to input the course name
			System.out.println("Please enter the course name you would like to use.");
			//stores answer
			course = userInput.nextLine();
			//extra space for neatness
			System.out.println("");	
			System.out.println("");	
			//informing the user of the next step
			System.out.println("Please now enter your 4 category weightings, if you do not use some categories, just make sure that the rest add up to 70%.");
			System.out.println("");	
			System.out.println("");	
			System.out.println("");	


			//adding a while loop to implement countermeasures incase user does not input a grade that adds up to 70
			while (flag) {

				//while loops added to use try and catch
				while (flag3){
				
					//asking the weight for knowledge
					System.out.println("Enter the decimal for knowledge.");

					//try used to see what happens in the code
					try {
						//storing answer for knowledge
						kweight = userInput.nextDouble();
						flag3 = false;

					}

					//a catch inputted to catch the InputMismatchException incase the user inputs something other than a number
					catch (InputMismatchException e) {

						System.out.println("Please enter a proper number, such as 35.");
						userInput.next();
					}
				}

				//setting the boolean to true; resets the boolean so it can be used for more try and catches
				flag3 = true;

				while (flag3){
					//asking the weight for communication
					System.out.println ("Enter the decimal for communication.");

					//try used to see what happens in the code
					try {

						//storing answer for communication
						cweight = userInput.nextDouble();	
						flag3 = false;

					}
					
					//a catch inputted to catch the InputMismatchException incase the user inputs something other than a number
					catch (InputMismatchException e){

						System.out.println("Please enter a proper number, such as 35");
						userInput.next();
					}

				}

				//setting the boolean to true; resets the boolean so it can be used for more try and catches
				flag3 = true;

				while (flag3){
					//asking the weight for application
					System.out.println("Enter the decimal for application.");

					//try used to see what happens in the code
					try {

						//storing answer for application
						aweight = userInput.nextDouble();
						flag3 = false;

					}	

					//a catch inputted to catch the InputMismatchException incase the user inputs something other than a number
					catch (InputMismatchException e){

						System.out.println("Please enter a proper number, such as 35");
						userInput.next();
					}

				}

				//setting the boolean to true; resets the boolean so it can be used for more try and catches
				flag3 = true;

				while (flag3){

					//asking the weight for thinking
					System.out.println("Enter the decimal for thinking.");

					//try used to see what happens in the code
					try {
			
						//storing answer for thinking 
						tweight = userInput.nextDouble();
						flag3 = false;

					}

					//a catch inputted to catch the InputMismatchException incase the user inputs something other than a number
					catch (InputMismatchException e){

						System.out.println("Please enter a proper number, such as 35");
						userInput.next();
					}

				}
			
				flag3 = true;
				System.out.println(kweight + cweight + aweight + tweight);
				// if statement used to loop until the user enters a sum of 70
				if (kweight + cweight + aweight + tweight == 70) {
					//setting the boolean to false; ends while loop
					flag = false;
				

				}

				//else if statement used to redirect loop if the weightings do not add up to 0.70
				else {
					//gives a statement asking the user to re-enter a set of weightings that add up to 70% (0.70)
					System.out.println("Please enter a set of categorys that add up to 70%.");
	 
				}
			}

			//setting weightings equal to a decimal again for equation formatting
			knowledge = (kweight /100);
			communication = (cweight /100);
			application = (aweight /100);
			thinking = (tweight /100);
			//setting the boolean to true; resets the boolean so it can be used for more try and catches
			flag = true;		
			//extra space for neatness
			System.out.println("");	
			System.out.println("");	
			//informing the user of the next step
			System.out.println("The next step is to input your marks for your assignment. This can include all 4 categories, depending on the assignment. ");
			System.out.println("");	
			System.out.println("");	
			System.out.println("");	
			//creating a while loop in order to use try and catch and if/else statements
			while (flag) {

				//asking user to input the mark they got for knowledge
				System.out.println ("Please enter the mark for knowledge as a decimal (one decimal place). If there is no mark for knowledge, then enter the mark as 0.");
				//stores mark for knowledge
				//try used to see what happens in the code
				try {
					//stores percentage for knowledge
					decimalk = userInput.nextDouble();
					//if statement used to end loop if the mark is from 0-100
					if (decimalk <=100 && decimalk >= 0){
						
						//setting the boolean to false; ends while loop
						flag = false;


					}

					//if the parameters are not between 0-100, then the else statement redirects the user to the beginning of the question
					else {
						
						//informs the user that the mark is not between 0-100
						System.out.println("This is an invalid mark, please enter a mark that is between 0-100.");

					}
				

				}

				//a catch inputted to catch the InputMismatchException incase the user inputs something other than a number
				catch (InputMismatchException e){

					//informs the user that the mark is not between 0-100
					System.out.println("This is an invalid mark, please enter a mark that is between 0-100.");
					//allows user to recieve input again
					userInput.next();
				}

			}

			//setting the boolean to true; resets the boolean so it can be used for more try and catches
			flag = true;
			//creating a while loop in order to use try and catch and if/else statements
			while (flag){
				//asking user to input the mark they got for communication
				System.out.println ("Please enter the mark for communication as a whole number (one decimal place). If there is no mark for communication, then enter the mark as 0.");

				//try used to see what happens in the code
				try {
					//stores percentage for communication
					decimalc = userInput.nextDouble();

					//if statement used to end loop is the mark is from 0-100
					if (decimalc <=100 && decimalc >=0){
						//setting the boolean to false; ends while loop
						flag = false;

					}

					//if the parameters are not between 0-100, then the else statement redirects the user to the beginning of the question
					else {
						
						//informs the user that the mark is not between 0-100
						System.out.println("This is an invalid mark, please enter a mark that is between 0-100.");

					}

				}

				//a catch inputted to catch the InputMismatchException incase the user inputs something other than a number
				catch (InputMismatchException e){

					//informs the user that the mark is not between 0-100
					System.out.println("This is an invalid mark, please enter a mark that is between 1-100.");
					//allows user to recieve input again
					userInput.next();

				}


			
			}		

			//setting the boolean to true; resets the boolean so it can be used for more try and catches
			flag = true;
			//creating a while loop in order to use try and catch and if/else statements
			while (flag) {

				//asking user to input the mark they got for application
				System.out.println ("Please enter the mark for application as a decimal (one decimal place). If there is no mark for application, then enter the mark as 0.");

				//try used to see what happens in the code
				try {

					//stores percentage for application
					decimala = userInput.nextDouble();

					//if statement used to end loop is the mark is from 0-100
					if (decimala <=100 && decimala >=0){

						//setting the boolean to false; ends while loop
						flag = false;

					}

					//if the parameters are not between 0-100, then the else statement redirects the user to the beginning of the question
					else {

						//informs the user that the mark is not between 0-100
						System.out.println("This is an invalid mark, please enter a mark that is between 1-100.");

					}
				}

				//a catch inputted to catch the InputMismatchException incase the user inputs something other than a number
				catch (InputMismatchException e){

					//informs the user that the mark is not between 0-100
					System.out.println("This is an invalid mark, please enter a mark that is between 1-100.");
					//allows user to recieve input again
					userInput.next();

				}

			}			
		
			//setting the boolean to true; resets the boolean so it can be used for more try and catches
			flag = true;

			//creating a while loop in order to use try and catch and if/else statements
			while (flag){

				//asking user to input the mark they got for thinking
				System.out.println ("Please enter the mark for thinking as a decimal (one decimal place). If there is no mark for thinking, then enter the mark as 0.");

				try {
					
					//stores percentage for thinking
					decimalt= userInput.nextDouble();

					//if statement used to end loop is the mark is from 0-100
					if (decimalt <=100 && decimalt >=0){

						//setting the boolean to false; ends while loop
						flag = false;

					}

					//if the parameters are not between 0-100, then the else statement redirects the user to the beginning of the question
					else {

						//informs the user that the mark is not between 0-100
						System.out.println("This is an invalid mark, please enter a mark that is between 1-100.");

					}
				}

				//a catch inputted to catch the InputMismatchException incase the user inputs something other than a number
				catch (InputMismatchException e){

					//informs the user that the mark is not between 0-100
					System.out.println("This is an invalid mark, please enter a mark that is between 1-100.");
					//allows user to recieve input again
					userInput.next();

				}
					
			}

			//setting the boolean to true; resets the boolean so it can be used for more try and catches
			flag = true;

	
			//formula for average
			mark = ( (knowledge * decimalk) + (communication * decimalc) + (application * decimala) + (thinking * decimalt) ) / 0.70;

			//adding a dot to represent a stalling action
			System.out.println("Calcualting.");
			
			//adding try and catches so the thread sleep works

			try{
				//causes the processor to sleep for 0.5 seconds
				Thread.sleep(1500);

			}
			
			catch (InterruptedException e){
			
			}
			  	
			//adding dots to represent a stalling action
			System.out.println("Still calculating..");
			//adding try and catches so the thread sleep works

			try{
				//causes the processor to sleep for 0.5 seconds 
				Thread.sleep(1500);
				
			}
			
			catch (InterruptedException e){
			}
			
			//adding dots to represent a stalling action
			System.out.println("bruh this COVID-19 really be slowing this...");
				
			//adding try and catches so the thread sleep works
			try{
				//causes the processor to sleep for 0.75 seconds
				Thread.sleep(1500);
				
			}
			catch (InterruptedException e){
			}

			//gives an answer from the initial question
			System.out.println ("Okay!");
		
			//adding try and catches so the thread sleep works
			try{
				//causes the processor to sleep for 0.75 seconds
				Thread.sleep(1500);
				
			}
			catch (InterruptedException e){
			} 

			//clears the terminal
			System.out.print("\033[H\033[2J\033[H\033[2J");

			//creating array to sort category marks from lowest to highest
			double markArray []= new double [4];
			//setting array values to the four percentages
			markArray [0] = decimalk;
			markArray [1] = decimalc;
			markArray [2] = decimala;
			markArray [3] = decimalt;
			int i = 1;

			//array.sort used to sort from lowest to highest percentage
			Arrays.sort (markArray);

			//for loop used to set the sorted arrays to a double in order to print 
			for (double number : markArray) {
				//printing category marks from lowest to highest
				System.out.println("Grade # " + i + ": "+ number + "%");
				//counter used to count numbers of grades
				++i;
	    	}

	   		//printing overall grade
	   		System.out.println ("Your overall grade is: " + mark + "%");
	   		//extra space used for neatness
			System.out.println("");	
			//asking user if they want to restart the program 		
			System.out.println("Would you like to restart the program again? (type n or no to end, any other input will restart the program.)\n");
			option = userInput.next();
			//using an if statement so if the user wanted to restart, the loop will be false, restarting the program
			if (option.equalsIgnoreCase("n") || option.equalsIgnoreCase("no")) {

				flag2 = false;

			}

			//goodbye greet
			System.out.print("Thank you so much for using the Grade Calculator! Hope to see you again!");

			//adding try and catches so the thread sleep works
			try{
				//causes the processor to sleep for 0.75 seconds
				Thread.sleep(1500);
				
			}
			catch (InterruptedException e){
			}

			//clears the terminal
			System.out.print("\033[H\033[2J\033[H\033[2J");

		}

	}
			
}