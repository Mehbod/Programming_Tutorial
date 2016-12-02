import java.util.Scanner;

//beginner
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
	/*
	 * String s=s.concat(n);
	 * char letter=s.charAt(2);
	 * String.valueOf(letter);
	 * boolean test=a.equals(b);
	 * 	
	 */

public class Addition {
	public static int[]Num=new int[100];
    	 public static int Scanner(int count) {
    		 
    			
    				System.out.print("Please Enter the number: ");
    				Scanner scan = new Scanner(System.in);
    				String inputt=scan.next();
    				if(inputt.equals("s")){
    					return count;
    					}
    					else{
    						int intig = Integer.parseInt(inputt);
    						Num[count]=intig;
    						return Scanner(++count);			 	
    					}
    			}
    	 public static int Print(int count,int y) {
    		 
				
				if(count==y){
					return count;
					}
					else{
						System.out.print(Num[y]+", ");
						return Print(count,++y);			 	
					}
			}
	   public static void main(String[] args) {
		 		 
		 int x=0,y=0;
		 x=Scanner(x);
		 Print(x,y);
	   	 }

}
