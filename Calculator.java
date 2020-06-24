package calci;
import java.util.Scanner;
public class Calculator {
	          public static void main(String[] args)
	          {
	        	  System.out.println("Enter two numbers: ");
	        	  Scanner sc = new Scanner(System.in);
	        	  int result=0;
	        	  int a=sc.nextInt();
	        	  int b=sc.nextInt();
	        	  System.out.println("Enter the operation:");
	        	  sc.nextLine();
	        	  char ch=sc.nextLine().charAt(0);
	        	  switch(ch)
	        	  { 
	        	  case '+': result=a+b; 
	        	            break;
	        	    
	        	  case '-': result=a-b; 
  	                           break;
	        	  case '*': result=a*b; 
  	                          break;
  	    
	        	  case '/': result=a/b; 
  	                          break;
  	    
	        	  default:
	        		  System.out.println("Invalid option ");
	        		  
	        	  
	        	  }
	        	  
	        	  System.out.println("result:"+result);
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	          }
	
	

}
