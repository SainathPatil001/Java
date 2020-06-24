package noofdigit;
import java.util.Scanner;
public class No_of_digit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    int number=sc.nextInt();
    int no_of_digit=(int)Math.log10(number)+1;
    
    System.out.println("The number of digits in "+number+" are"+" "+no_of_digit);
	}

}
