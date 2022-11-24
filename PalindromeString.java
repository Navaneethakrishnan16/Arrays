package palindromeString;

public class PalindromeString {
            
	  

	public static void PalindromeReverse(String enterString)
	      {
			 
			StringBuffer change = new StringBuffer(enterString);
	    	  
	    	  change.reverse();
  
	    	  String palindrome=change.toString();
	    	  
	    	  if(enterString.equals(palindrome)) 
	    		System.out.println("it is a Palindrome String");  
	    	  
	    	  else
	    		  System.out.println("It is not a Palindrome String");
	      }
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
             
              PalindromeReverse("MadaM");
              
		
	}

}
