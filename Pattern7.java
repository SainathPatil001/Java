package patterns;
import java.util.Scanner;

public class Pattern7{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      int number =sc.nextInt();
       System.out.println("*");

     for(int i=2;i<=number-1;i++)
      {    System.out.print("* ");
          for(int j=0;j<i-2;j++)
  	       {
  		System.out.print(" ");
  	       }
          System.out.print("* ");
          
      
        System.out.println();
      }
     
     
     
     if(number>1){
      for(int i=0;i<number;i++)
         System.out.print("* ");
	}

}
}