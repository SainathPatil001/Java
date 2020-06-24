package statickeyword;



public class StaticKeyword{
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Static obj;
	obj=new Static();
	Static.y=500;
	
	obj.showdata();


}
}	
class  Static {

	/**
	 * @param args
	 */
	static int x;
		static int y;
		static void  showdata()
			{
				
				x=10;
				System.out.println("The value of y is "+y);
				System.out.println(x);
			}
}
