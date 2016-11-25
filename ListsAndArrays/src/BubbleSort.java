import java.util.Scanner;

public class BubbleSort {
//intermediate
	
	//todo: sort an array using bubblesort.
	//if you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	



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
	public static int bubblesort(int count) {
		int temp;
		count--;
		for(int i=0;i<count;i++){
			for(int j=0;j<count;j++){
				if(Num[j]>Num[j+1]){
					temp=Num[j];
					Num[j]=Num[j+1];
					Num[j+1]=temp;
				}
				
			}
			
		}
		return count;

	
	}
	public static int PrintArray(int count) {
		//count--;
		for(int i=0;i<count;i++){
			System.out.print(Num[i]+", ");
			
			
		}
		return count;

	
	}
	public static void main(String[] args) {
		int x = 0;
		x=AddtoArray(x);
		bubblesort(x);
		PrintArray(x);
	}	
}
