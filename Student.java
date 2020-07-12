package pakage;

public class Student {

	/**
	 * @param args
	 */
       
	private
		int rollno;
	   String name;
       
	
  public void setrollno(int rollno)
  {
	 this.rollno=rollno;
  }
	
  
  
  public void setname(String name)
  {
	 this.name=name;
  }
  
  public void printrollno()
  {
	  System.out.println("Rollno:"+rollno);
  }
  
  public void printname()
  {
	  System.out.println("Name:"+name);
  }
  
}
