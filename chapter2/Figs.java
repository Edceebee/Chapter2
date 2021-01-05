package Excercises;// Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result.

	import java.util.Scanner;

		public class Figs	{

		public static void main(String[] args)	{		//beginning of main method

	Scanner input = new Scanner(System.in);

		int number1;
		int number2;

	System.out.print("Enter first number");		//prompt
	number1 = input.nextInt();

	System.out.print("Enter second number");
	number2 = input.nextInt();

	if(number1 * number1 == number2)
	System.out.print( "First number is a multiple of number2");

		else
	System.out.print("First number is not a multiple of number2");

		}
}


	