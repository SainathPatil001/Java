package sorting;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={2,4,1,3,5};
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{  
			 int minindex=i;
		   for(int j=i;j<n;j++)
		   {
			     if(a[j]<a[minindex])
			    	 minindex=j;   
		   }
		    int temp;
		    temp=a[i];
		    a[i]=a[minindex];
		    a[minindex]=temp;
		
		}
		
	  for(int i=0;i<n;i++)
		  System.out.print(a[i]+" ");
	}

}
