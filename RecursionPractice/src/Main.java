import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);
		System.out.println();
		
		double fact = factorial(number1);
		System.out.println("Factorial " + number1 + " is " + fact);
	}
	
	public static double factorial(double n){
		if (n==1) return 1;
		return n * factorial(n-1);
	}
	
	public int
}
