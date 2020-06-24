package datatypes;
import java.util.Scanner;
public class Datatypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		byte age=10;
//		float age2=1.230f; 
//		System.out.println(age2);
		 
		
		float simpleinterst;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principle value:");
		int principle=sc.nextInt();
		System.out.println("Enter the value of rate:");
		float rate=sc.nextFloat();
	    
		System.out.println("Enter the value of time:");
		float time=sc.nextFloat();
		
		simpleinterst=(principle*rate*time)/100;
		
		System.out.println(simpleinterst);
		
		
		

	}

}
