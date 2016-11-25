import java.util.Scanner;
//beginner
	//todo: write some methods for some basic operations with arrays, like:
	//+return the length of an array
	//+drop the last element of an array
	//+sum up all the elements of an integer array
	//+check if an array contains a given element
public class Basics {
	public static int[]Num=new int[100];
	public static int AddtoArray(int count) {
		System.out.print("Please Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int inputt=scan.nextInt();
		if(inputt == 0){
			return count;
			}
			else{
				Num[count]=inputt;
				return AddtoArray(++count);			 	
			}
	}
	public static int SumupArray(int count,int sum) {
		
		if(count == 0){
			sum+=Num[count];
			return sum;
			}
			else{
				sum+=Num[count];
				return SumupArray(--count,sum);			 	
			}

	
	}
	public static int SearchArray(int count,int element,int par) {
		
		for(int j=0;j<=count;j++){
			if(Num[j]==element){
				System.out.print(element + " Found");
				par++;
			}
		}
		return par;
	}
	public static void main(String[] args) {
		int x = 0;
		x=AddtoArray(x);
		System.out.println("length of array :"+x);//Print length of array
		Num[--x]=0; //Drop last element
		int y=--x,sum=0;
		sum=SumupArray(y,sum);
		System.out.println("Sum up of array :"+sum);//Print Sum
		System.out.print("Please Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int srci=scan.nextInt();
		int par = 0;
		par=SearchArray(x,srci,par);
		if(par==0){
			System.out.print(srci + " not Found");
		}		
	}	
}
