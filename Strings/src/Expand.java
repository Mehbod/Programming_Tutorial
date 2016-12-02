import java.util.Scanner;

//advanced
//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee 
public class Expand {
	public static String inputt;

	public static int Expend(int lenght,int x){
		if(x==lenght){
			return 0;
		}else{
			char chr=inputt.charAt(x);
			if(Character.isDigit(chr)){
				int i=Character.getNumericValue(chr);
				
				for(int j=0;j<i;j++){
					System.out.print(inputt.charAt(x+1));
				}
			}else{
				System.out.print(inputt.charAt(x));
				x++;
			}
			
			return Expend(lenght,++x);
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a name: ");
		inputt=scan.next();
		int lenght=inputt.length();
		int x=0;
		Expend(lenght,x);
		
		 
		
	}
	
}
