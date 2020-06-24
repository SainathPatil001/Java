package matrixaddition;

import java.util.Scanner;

public class Matrixaddition {
	   
	 public static void main(String[] args){
		 
		     Scanner sc= new Scanner(System.in);
		      int rows,cols;
		      int sum=0;
		      
		      rows=sc.nextInt();
		      cols=sc.nextInt();
		      
		      int arr[][]=new int[rows][cols];
		      for(int i=0;i<rows;i++)
		      {
		    	 for(int j=0;j<cols;j++)
		    	 {
		    		 
		    		 arr[i][j]=sc.nextInt();
		    		 sum+=arr[i][j];
		    	 }
		    	  
		    	  
		      }
		     
		     System.out.println("The sum of Elements of array is "+sum);
		      for(int i=0;i<rows;i++)
		      {
		    	 for(int j=0;j<cols;j++)
		    	 {
		    		System.out.print(arr[i][j]+" ");
		    	 }
		    	  System.out.println();
		    	  
		      }
		     
		     
		     
		     
		 
	 }
	
	
	
	
	
	

}
