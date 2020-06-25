package initialiazation;

public class Instance_initialization {
    private int x;
	{
		
		System.out.println("Instance initialization =  "+x);
		
		x=x+10;
	}
	
	Instance_initialization()
	{
		System.out.println("Constructor: "+ x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_initialization obj =new Instance_initialization();
		Instance_initialization obj2 =new Instance_initialization();
	}

}
