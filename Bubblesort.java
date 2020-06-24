package sorting;

public class Bubblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={2,4,1,3,5};
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{  
			 boolean cond=true;
		   for(int j=0;j<n-1-i;j++)
		   { 
			   if(a[j]>a[j+1])
			   { 
				   int temp;
				   temp=a[j];
				   a[j]=a[j+1];
				   a[j+1]=temp;
				   cond=false;
				      
			   }
			       
		   }	
		 if(cond) break;	
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] +" ");
			
		}
		   
		
		
		
		
		
		

	}

}
