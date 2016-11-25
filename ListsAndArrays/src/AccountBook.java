import java.util.Scanner;

public class AccountBook {
//intermediate (multidimensional arrays)
	
	//todo: a bank will give you 2% interest on your savings stored on an account book.
	//for a certain amount of money you want to store in the account book create a multidimensional array where
	//the interest of the next 10 years is stored.
	//For that save the year and the amount of money. Write a method which takes a certain year as input (e.g. 2019) and an amount of money you would like to store
	//and returns the saving you would have for this year.
	
	/*int[][] arr = new int[5][2];
	 * pre: year and money
	 * 2016 -> 100 Euro
	 * 2017 -> 102 Euro
	 * ...
	 * 2026
	 * 
	 * 1. Method -> gets year and money and computes and stores array
	 * 2. Method -> gets year and return money
	 * */
	public static double[][] Num=new double[10][2];
	public static int ComputeArray(int year,double money,int count) {

		
		if(count == 10){
			return count;
			}
			else{

				Num[count][0]=year;
				money=money*1.02;
				Num[count][1]=money;
				return ComputeArray(++year,money,++count);			 	
			}
	}

	public static int CheckArray(int count,int check) {
		
		if(count == 10){
			return count;
			}
			else{
				if(check==Num[count][0]){
					System.out.println(Num[count][1]);
				}
				return CheckArray(++count,check);
			}
		
	}
	public static void main(String[] args) {
		System.out.print("Please Enter the Year: ");
		Scanner scan = new Scanner(System.in);
		int year=scan.nextInt();
		System.out.print("Please Enter amount of money: ");
		double money=scan.nextInt();
		int x = 0;
		ComputeArray(year,money,x);
		System.out.print("Please Enter a year: ");
		int check=scan.nextInt();
		int y=0;
		CheckArray(y,check);
		
		
	}	

}
