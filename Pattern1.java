package patterns;
import java.util.Scanner;

public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		
		for(int i=0;i<number;i++)
		{    
			
			for(int k=0;k<i*2;k++)
			{
				System.out.print(" ");
			}
			for(int j=number-1;j>=i;j--)
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
		}

	}

}
