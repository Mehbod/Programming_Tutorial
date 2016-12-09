import java.util.Scanner;

//advanced
//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//+Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//+Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee 
public class Expand {
	public static String inputt;

	/*public static int Expend(int lenght,int x){
		char chr;
		char chr2 = 0;
		char chr3 = 0;
		if(x>=lenght){
			return 0;
		}else{
			chr=inputt.charAt(x);
			if(x+1<lenght){
				chr2=inputt.charAt(x+1);
				}
			if(x+2<lenght){
				chr3=inputt.charAt(x+2);
				}
			if(Character.isDigit(chr)){
				int i=Character.getNumericValue(chr);
				if(Character.isDigit(chr2)){
					i*=10;
					int z=Character.getNumericValue(chr2);
					i+=z;
					x++;
					if(Character.isDigit(chr3)){
						i*=10;
						z=Character.getNumericValue(chr3);
						i+=z;
						x++;
					}
				}					
				for(int j=0;j<i;j++){
					System.out.print(inputt.charAt(x+1));
				}
				x++;				
			}else{
				System.out.print(inputt.charAt(x));			
			}	
			
			return Expend(lenght,++x);
		}		
	}*/
	public static int Expend(int lenght,int x){
	char chr;
	char chr2 = 0;
	char chr3 = 0;
	if(x>=lenght){
		return 0;
	}else{

		while(Character.isDigit(inputt.charAt(x))){
			int i=Character.getNumericValue(chr);
			
				
				int z=Character.getNumericValue(chr2);
				i+=z;
				i*=10;
				x++;
				
		}					
			for(int j=0;j<i;j++){
				System.out.print(inputt.charAt(x+1));
			}
			x++;				
		
		//	System.out.print(inputt.charAt(x));			
			
		
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
