package stringQuestions;

public class OptimisedAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a="aaaiiic";
		
		String b="ciiiaaa";
		boolean isAnagram=true;
		
		int arr[]=new int[256];
		int brr[]=new int[256];
		
		 for(char c: a.toCharArray())
		 {   
			  int index=(int) c;
			 arr[index]++;
			 
		 }
		 
		 for(char c: b.toCharArray())
		 {   
			  int index=(int) c;
			 brr[index]++;
			 
		 }
		 
		 for(int i=0;i<256;i++)
		 {
			 if(arr[i] != brr[i])
			 {
				 isAnagram=false;
				 break;
			 }
		 }
	
		if(isAnagram)
		{
			System.out.println("String is a anagram");
		}
		else
		{
			System.out.println("String is not a anagram");
		}

	}

}
