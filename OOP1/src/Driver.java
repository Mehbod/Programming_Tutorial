import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Student a = new Student("Jakoby", 123456);
		Professor b=new Professor("Horneker","HCI");
		System.out.println(a.getName()+ " , "+a.getmatrNr());
		System.out.println(b.getName()+" , " +b.getchair());
		System.out.println("please Enter id number of student");
		Scanner scan = new Scanner(System.in);
		int inputt=scan.nextInt();
		a.setmatrNr(inputt);
		System.out.println("please Enter name of student");
		String inputt2=scan.next();
		a.setName(inputt2);
		
		System.out.println(a.getName()+ " , "+a.getmatrNr());
		System.out.println(b.getName()+" , " +b.getchair());
		//a.addLecture("Stooryboard");
		//b.addLecture("Stooryboard");
		
		//todo: create at least 1 student, 1 professor and one lecture
		// add the lecture to the student and the professor
	}
}
