package reverseStrikng;

public class ReverseNumber {
     public static void reverseNumber(int number) {
    	      
    	 int temporary,sum=0,reminder; 
    	      
    	      temporary = number;
    	      
    	      while(number != 0) {
    	    	  
    	    	 reminder = number%10;
    	    	  
    	    	 sum = sum*10 + reminder;
    	    	 
    	    	 number = number/10;
    	      }
    	      
    	      if(sum == temporary) {
    	    	  System.out.println("It is a Palindrome");
    	      }
    	      else
    	    	  System.out.println("It is not a Palindrome");
     }
	public static void main(String[] args) {
		
         reverseNumber(121);  
	}

}
