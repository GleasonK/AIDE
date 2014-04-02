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

        int num1 = (int) number1;
        int num2 = (int) number2;

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);
		System.out.println();
		
		double fact = factorial(num1);
		System.out.println("Factorial " + num1 + " is " + fact);
		
		int countOf8 = count8(num2);
		System.out.println("Count8 in " + num2 + " is " + countOf8);
		
		int bunnies = bunnyEars(num2);
		System.out.println("Total ears on " + num2 +" bunnies is " + bunnies);

        int hi = countHi2("hihixhixhihi");
        System.out.println("Num of 'hi' in hibhixhiphi is " + hi);
	}
	
	public static int factorial(int n){
		if (n==1) return 1;
		return n * factorial(n-1);
	}

    //Count number of 8's, 88 doubles to 4.
	public static int count8(int n){
		if (n%10==0) return 0;
		if (n%10==8 && n/10%10==8) return 3+count8(n/10);
		if (n%10==8) return 1 + count8(n/10);
		return count8(n/10);
	}

    //Count number of ears on Bunnies
	public static int bunnyEars(int bunnies) {
		if (bunnies==0) return bunnies;
		return 2 + bunnyEars(bunnies-1);
	}

    //Add all the digits of a number together
    public static int sumDigits(int n){
        if (n/10==0) return n;
        return n%10 + sumDigits(n/10);
    }

    //Count the number of "hi" not preceeded by 'x'
    public static int countHi2(String str) {
        int len = str.length();
        if (len < 2) return 0;
        if (str.substring(len-2, len).equals("hi")) {
            if ((len > 2 && str.charAt(len-3) != 'x') || len == 2 )
                return 1 + countHi2(str.substring(0, len-1));
        }
        return countHi2(str.substring(0, len-1));
    }

}
