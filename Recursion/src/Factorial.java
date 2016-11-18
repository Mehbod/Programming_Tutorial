import java.util.Scanner;

public class Factorial {

	public static int factorial(int number, int result) {
		if(number == 0){
			return result;
			}
			else{
				result*=number;
				return factorial(--number, result); 	
			}
	}

	public static void main(String[] args) {
		
		System.out.println("Please Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int inputt=scan.nextInt();
		System.out.println(factorial(inputt-1,inputt));
		
	}
}