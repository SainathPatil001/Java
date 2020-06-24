package simpleintrest;
import java.util.Scanner;


public class Simpleintrest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int principal = sc.nextInt();
		float rate= sc.nextFloat();
		int time= sc.nextInt();
		double simpleintrest=(principal*rate*time)/100;
		System.out.println("Simpleintrest is "+simpleintrest);
		

	}

}
