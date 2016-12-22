import java.util.ArrayList;


public class Professor {
	private String name;
	private String chair;
	private ArrayList lectures = new ArrayList();
	
	public Professor(String name,String chair){
		this.name=name;
		this.chair=chair;	
	}
	  public void setName(String name){
	  		this.name=name;
	  }
	  public String getName(){
	  		return name;
	  }
	  public void setchair(String chair){
		this.chair=chair;
	  }
	  public String getchair(){
	  		return chair;
	  }
	
	//todo: write a constructur that already gives the student a name and a chair
	/*
	 * 

	 * 
	 * 

	 * 
	 * Professor a = new Professor("Jakoby", "Theoretical Computer Science");
	 * 
	 * a.addLecture(some lecture);
	 * 
	 * public void setName(String name){
	 * 		this.name=name;
	 * }
	 * 
	 * public String getName(){
	 * 		return name;
	 * }
	 * 
	 * a.getName()
	 * 
	 * a.setName("Rodehorst");
	 * 
	 * */
	
	//todo: write getter and setter methods
	
	public void addLecture(Lecture lecture){
		lectures.add(lecture.getName());
		//todo: fill this method
		
	}
	
}
