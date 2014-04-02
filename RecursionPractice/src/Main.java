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
		
		double fact = factorial((int) number1);
		System.out.println("Factorial " + number1 + " is " + fact);
		
		int countOf8 = count8((int) number2);
		System.out.println("Count8 in " + (int) number2 + " is " + countOf8);
		
		int bunnies = bunnyEars((int) number2);
		System.out.println("Total ears on " + (int) number2 +" bunnies is " + bunnies);
	}
	
	public static int factorial(int n){
		if (n==1) return 1;
		return n * factorial(n-1);
	}
	
	public static int count8(int n){
		if (n%10==0) return 0;
		if (n%10==8 && n/10%10==8) return 3+count8(n/10);
		if (n%10==8) return 1 + count8(n/10);
		return count8(n/10);
	}
	public static int bunnyEars(int bunnies) {
		if (bunnies==0) return bunnies;
		return 2+bunnyEars(bunnies-1);
	}
}
