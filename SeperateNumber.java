package chapter2;/* Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints                                      the digits separated from one another by three spaces each */


		import java.util.Scanner;

		public class SeperateNumber   {

			public static void main(String[] args)	{

		Scanner input = new Scanner(System.in);

			int number1;
			int number2;
			int number3;
			int number4;
			int number5;
		

		System.out.print("Enter first number");
		number1 = input.nextInt();

		System.out.print("Enter second number");
		number2 = input.nextInt();

		System.out.print("Enter third number");
		number3 = input.nextInt();

		System.out.print("Enter fourth number");
		number4 = input.nextInt();

		System.out.print("Enter fifth number");
		number5 = input.nextInt();


		System.out.print("number1  number2  number3  number4  number5  ");

}
		} 

