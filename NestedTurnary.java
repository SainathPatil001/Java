package nestedturnary;
import java.util.Scanner;

public class NestedTurnary {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=0;
		max=a>b?a>c?a:c : b>c?b:c;
		System.out.println("Max number is"+max);
	}

}
