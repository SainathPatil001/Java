package sorting;


public class InserrtionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]={1,-1,2,8,6,5,3},i,j;
		for( i=1;i<arr.length;i++)
		{   
			 int temp=arr[i];
			for( j=i-1;j>=0&&temp<arr[j];j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
			
		}
   
		for(int item=0;item<arr.length;item++)
		{
			System.out.print(arr[item]+" ");
		}
	}

}
