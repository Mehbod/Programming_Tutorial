import java.util.Scanner;

//intermediate
	//todo: take an String as input and reverse it. Then print it.
public class Reverse {
	public static String inputt;
	public static int Print(int count){
		if(count==0){
			return count;
		}else{
			System.out.print(inputt.charAt(count-1)+" ");
			return Print(--count);
		}	
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a name: ");
		inputt=scan.next();
		int x=inputt.length();
//		int y=0;
		Print(x);		
	}

}
