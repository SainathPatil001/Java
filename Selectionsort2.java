package sorting;

public class Selectionsort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={-1,3,4,2,5,6};
		int length=arr.length;
		
		for(int i=0;i<length-1;i++)
		{    int minIndex=i;
		   for(int j=i+1;j<length;j++)
		   {
			   
			  if(arr[j]<arr[minIndex])
			  {
				  minIndex=j;
			  }
			   
			   
		   }
			
		  int temp=arr[i];
		  arr[i]=arr[minIndex];
		  arr[minIndex]=temp;
			
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
