package stringQuestions;

public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a="sai";
		
		String b="isa";
		boolean isAnagram=false;
		boolean visited[]=new boolean[a.length()];
		
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{   
				 isAnagram=false;
				char c=a.charAt(i);
			  for(int j=0;j<a.length();j++)
			  {
				  if(c == b.charAt(j)&& !visited[j])
				  {
					  visited[j]=true;
					  
					  isAnagram=true;
					  break;
				  }
				  
				  
				  
			  }
				
				if(!isAnagram)
				{
					break;
				}
				
				
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
