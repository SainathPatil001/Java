package patterns;
import java.util.Scanner;

public class Pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        
        
        for(int i=0;i<number;i++)
        {
        	for(int j=0;j<number-i;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        
        
	}

}
