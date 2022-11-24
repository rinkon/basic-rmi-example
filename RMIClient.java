import java.rmi.Naming;
import java.util.Scanner;

public class RMIClient {
	
	public static void main(String[] args) throws Exception {
		
		MathOperations mc = (MathOperations) Naming.lookup("MATH_OPERATIONS");
		int first, second;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		first = sc.nextInt();
		
		System.out.print("Enter second number: ");
		second = sc.nextInt();
		
		sc.close();
		
		
		System.out.println("Addition is: " + mc.add(first, second));
		
		System.out.println("Subtraction is: " + mc.subtract(first, second));
		
		System.out.println("Multiplication is: " + mc.multiply(first, second));
		
		System.out.println("Division is: " + mc.divide(first, second));
		
	}

}
