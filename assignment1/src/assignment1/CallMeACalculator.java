package assignment1;
//Program to calculate addition, subtraction,
//multiplication, division of two integers
//Author:Omar Ihab Mohammed Aboubakr Abdalla Shehata
import java.util.Scanner;//We need to import class in which scanner is 
//in
public class CallMeACalculator {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);//declaring the
		//scanner
		System.out.println("Welcome to the Call Me A Calculator "
				+ "Program");//Welcome message
		System.out.println("You will be asked to enter 2 integers"
				+ "you can pick any (Except 0) ");//Prompt to
		//explain what to and not to enter
		System.out.println("Please enter your first integer: ");//Prompt
		//to enter first integer
		System.out.println("Please enter your second integer: ");
		//Prompt to enter second integer
		int fInteger = myKeyboard.nextInt();//Declaration of the first
		//integer variable and instruction for scanner to read first
		//integer
		int sInteger = myKeyboard.nextInt();//Declaration of the second
		//integer variable and instruction for scanner to read second
		//integer10
		int sumOfAddition = fInteger + sInteger;//instruction to add 
		//first and second integers
		int sumOfSubtraction = fInteger - sInteger;//Instruction to 
		//subtract first integer from second integer
		int multiplicationProduct = fInteger * sInteger;//instruction
		//to multiply first and second integer
		double divisionProduct =(fInteger / (double)sInteger);//instruction to divide
		//first integer by second integer using casting to avoid integer division
		System.out.println(fInteger + " + " + sInteger + " = " 
		+ sumOfAddition);//displays sum of addition of both integers
		System.out.println(fInteger + " - " + sInteger + " = " 
				+ sumOfSubtraction);//displays sum of subtraction 
		//of both integers
		System.out.println(fInteger + " * " + sInteger + " = " 
				+ multiplicationProduct);//displays product of multiplication
		//of both integers
		System.out.println(fInteger + " / " + sInteger + " = " 
				+ divisionProduct);//displays product of division
		//of both integers
		System.out.println("This is the end of the program.");//Prompt to user 
		//to display end of program message
		myKeyboard.close();//to close the scanner
	}
}
