package pakage11;
import pakage2.*;



public class Example extends ImportClass{

	public static void main(String[] args)
	{   int rollno=10;
	   String name="Sainath"; 
		ImportClass s1=new ImportClass();
	
		  ImportClass.abc s2=s1.new abc();
		s1.setdata(rollno,name);
		System.out.println("Rollno is "+s1.getrollno());
		System.out.println("Name is "+s1.getName());
		  System.out.println(s2.x);
	}

	
	
}
