package initialiazation;

public class Static_initialization {
    private static int x;
    static
	{
		
		System.out.println("Instance initialization =  "+x);
		
		x=x+10;
	}
    
    Static_initialization(){
    	System.out.println("Constructor:"+x);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Static_initialization();
		new Static_initialization();
	}

}
