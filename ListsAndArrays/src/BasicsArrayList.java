import java.util.Scanner;

public class BasicsArrayList {
//beginner
	
	//todo: write some methods for basic operations with ArrayLists:
	//-write a method where you can add a certain value to an ArrayList
	//-write a method which prints all the values in an ArrayList

	public static int[]Num=new int[10];
	public static int AddtoArray(int count) {
		int temp=count+1;
		
		if(count == 10){
			return count;
			}
			else{
				System.out.print("Please Enter the number "+ temp+": ");
				Scanner scan = new Scanner(System.in);
				int inputt=scan.nextInt();
				Num[count]=inputt;
				return AddtoArray(++count);			 	
			}
	}

	public static int PrintArray(int count,int input) {
		
		if(input == 1){
			return count;
			}
			else{
				System.out.print(Num[count-input+1]+", ");
				return PrintArray(count,--input);	 	
			}
		
	}
	public static void main(String[] args) {
		int x = 0;
		x=AddtoArray(x);
		int input=x+1;
		PrintArray(x,input);
	}	
}
