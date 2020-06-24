package sumofdigits;
import java.util.Scanner;
public class Sumofdigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc =new Scanner(System.in);
         int sum=0,number;
         number=sc.nextInt();
         
         while(number>0)
         {
        	  int remainder;
        	  remainder=number%10;
        	  sum=sum+remainder;
        	 number/=10;
        	 
         }
         System.out.println("The sum of digits in a number is "+sum);
     
	}

}
