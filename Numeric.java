package chapter2;    // program that display the larger number followed by the words "is larger

	import java.util.Scanner;

	public class Numeric  {
	public static void main(String[] args)  {

	Scanner nums = new Scanner(System.in);
	
	int number1;
	int number2;

		System.out.print("Enter first interger");
		number1 = nums.nextInt();
		
		System.out.print("Enter second interger");
		number2 = nums.nextInt();
		


		if(number1 > number2)
		System.out.printf("%d is larger", number1);


		if(number2 > number1)
		System.out.printf("%d is larger", number2);

		
		if(number2 == number1)
		System.out.printf("%d equal");

}
}







		