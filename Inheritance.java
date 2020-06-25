package inhertance;


class parent{
	private int age;
	private  String name;
	 void setage(int n)
	 {
		 age=n;
	 }
	 void setname(String nm)
	 {
		 name=nm;
	 }
	int getage(){
		return(age);
	}
	String getname()
	{
		return(name);
	}
	
}

class child extends parent{
	 private int rollno;
	void setrollno(int rollno){
		this.rollno=rollno;
	}
	int getrollno(){
		return(rollno);
	}
	
}

public class Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();
		obj.setage(20);
		obj.setname("Sainath");
		obj.setrollno(29);
		System.out.println("Age of a Student is "+obj.getage());
		System.out.println("Name of a Student is "+obj.getname());
		System.out.println("Rollno of a Student is "+obj.getrollno());
		
		
		
		
		

	}

}
