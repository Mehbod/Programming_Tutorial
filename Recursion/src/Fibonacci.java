import java.util.Scanner;

public class Fibonacci {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	/*
	 * 
	 * public int testMethod(int x){
	 * 		if(x >= 5){
	 * 			return x:
	 * 		}
	 * 		else{
	 * 			return testMethod(x+1);
	 * 		}
	 * }
	 * */
	public static int fibonacci(int f1, int f2,int f3,int input) {
		if(input == 0){
			return f3;
			}
			else{
				
				f3=f2+f1;
				System.out.print(f3+",");
				f1=f2;
				f2=f3;
				return fibonacci(f1,f2,f3,--input);			 	
			}
	}
	public static void main(String[] args) {
		int f1 = 0,f2 = 1,f3 = 0;
		System.out.println("Please Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int inputt=scan.nextInt();
		//System.out.println(fibonacci(f1,f2,f3,inputt));
		fibonacci(f2,f1,f3,inputt);
	}
}