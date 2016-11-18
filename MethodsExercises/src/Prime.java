import java.util.Scanner;
public class Prime {
	
	
	public static void primefun(int number) {
	
		int count=0;
//		for( i=number;i==2;i--){
		for(int i=2;i<=number;i++){
			if(number%i==0){
				count++;
			}
		}
			if(count==1){
				System.out.print(number+",");
				
				
			
			
				
				
			}
			
		}
		
		
		
		//return (0);
	
	
	




	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputt=scan.nextInt();
		//todo: write a method which tells you if a given number is a prime or not
		for(int x=2;x<inputt;x++){
			//int d=0;
			
			//7%2 == 1
			//x=d%2;
			
			//d=
					primefun(x);
					
			
			
		}
	}
	
}
