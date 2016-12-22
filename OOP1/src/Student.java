import java.util.ArrayList;


public class Student {
	private String name;
	private int matrNr;
	private ArrayList lectures = new ArrayList();
	
	public Student(String name,int matrNr){
		this.name=name;
		this.matrNr=matrNr;	
	}	
	//+todo: write a constructur that already gives the student a name and a matriculation number
//	
	//+todo: write getter and setter methods
	  public void setName(String name){
	  		this.name=name;
	  }
	  public String getName(){
	  		return name;
	  }
	  public void setmatrNr(int matrNr){
		this.matrNr=matrNr;
	  }
	  public int getmatrNr(){
	  		return matrNr;
	  }

	public void addLecture(Lecture lecture){
		lectures.add(lecture.getName());
		//todo: fill this method
		
	}
}
