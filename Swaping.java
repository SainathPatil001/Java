package swap_without_temp;

public class Swaping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		System.out.println("The number before swaping are:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The number after swaping  are:"+a+" "+b );

	}

}
