package constructor;

class A{
	private int l,b;
	public A(){
		
		l=10;
		b=20;
		
		
	}
	
	void area()
	{
		int area;
		area =l*b;
		System.out.println("Area of Rectangle is "+area);
		
	}
	
	
}

public class Constructor {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		
		    A obj =new A();
		    obj.area();
		  
		

	}

}
