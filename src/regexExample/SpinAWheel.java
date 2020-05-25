package regexExample;

import java.util.Arrays;
import java.util.Scanner;

public class SpinAWheel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] wheelOptions = {"Pizza", "Pasta", "Burger", "Soda", "Burrito", "Tacos", "French Fries", "Steak"};
		
		//System.out.println("The wheel contains the following items   :" +  Arrays.toString(wheelOptions));
		System.out.println("Spin the wheel");
		
		System.out.println("But,pick a number first between and press enter to spin the wheel");
		
		//userinput
		int numberOfTest = in.nextInt();
		
		
		//function to generate random number 
		for(int i=0; i<numberOfTest; i++) {
			int index = (int)(Math.random()*10);
			System.out.println(wheelOptions[index]);
		}

	}

}
