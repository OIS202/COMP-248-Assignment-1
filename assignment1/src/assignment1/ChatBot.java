package assignment1;
//Program to ask for user's name and city 
//and output it in different formats
//Author:Omar Ihab Mohammed Aboubakr Abdalla Shehata
import java.util.Scanner;//We need to import class in which scanner is 
//in
public class ChatBot {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);//declaring the
		//scanner
		System.out.println("Welcome to the Chatbot "
				+ "Program");//Welcome message
		System.out.println("Please enter your name:  ");//Prompt to
		//user to ask them for their name
		String userName = myKeyboard.nextLine();//Declaration of the 
		//user's name and instruction to read the line of text
		System.out.println("Hello " + userName.toUpperCase() + ", "
				+"you have " + userName.length() + " characters in your"
				+ " name.");//instruction to output user's name in all 
		//upper case letters and the length of their name
		System.out.println("Which city are you in?(Type a city name "
				+ "with at least 3 letters)");//prompt for user to
		//his city name
		String userCity = myKeyboard.nextLine();//Declaration of variable
		//of user's city and instruction to read line of text
		String middleCapitalized = userCity.substring(0, userCity.length()/2)
				+ userCity.substring(userCity.length()/2, (userCity.length()/2)+1).toUpperCase()
				+ userCity.substring( (userCity.length()/2)+1);//to capitalize middle letter and form user city with middle letter capitalized
		System.out.println(middleCapitalized);//output user city with middle letter capitalized
		String SecondToLastCapitalized = userCity.substring(0, (userCity.length())-2)
				+ userCity.substring((userCity.length())-2, (userCity.length())-1).toUpperCase()
				+ userCity.substring( (userCity.length())-1);//to capitalize second to last letter and form user city with second to last letter capitalized
		System.out.println(SecondToLastCapitalized);//output user city with second to last letter capitalized
		myKeyboard.close();//to close the scanner
	}

}
