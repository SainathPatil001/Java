package sorting;

public class Insortionsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]={1,5,2,4,0,-1};
		
		for(int i=1,j;i<arr.length;i++)
		{   
			 int temp=arr[i];
			for(j=i-1;j>=0&&temp<arr[j];j--)
			{
				 arr[j+1]=arr[j];
				
			}
			arr[j+1]=temp;
			
			
			
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
