package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
	
	@RequestMapping("/words")
    public Message greeting(@RequestParam(value="word") String word) { 
	   boolean isPallandrom = true;
	   String reverse = "";
	   String message = "";
	   boolean anagramOfPalindrome=false;
	   
	   int length = word.length();   
	      for ( int i = length - 1; i >= 0; i-- )  {
	         reverse = reverse + word.charAt(i);
	      }
	      if (word.equals(reverse))  {
	    	  isPallandrom = true; 
	    	  message="Entered word is a palindrome";
	      }else  {
	    	  isPallandrom = false;   
	    	  message="Entered word is not a palindrome";
	     } 
	      int[] charCount = new int[128];
	        for(int i = 0 ; i < word.length() ; i++) {
	            charCount[(int)word.charAt(i)]++;
	        }
	        int oddCount = 0 ;
	        for(int i  = 0 ; i < 128 ; i++) {
	            if(charCount[i] % 2!=0) {
	                oddCount++;
	            }
	        }
	        if(oddCount != 0 && oddCount != 1) {
	        	anagramOfPalindrome=false;
	        }else {
	        	anagramOfPalindrome=true;
	        }
	        
	   
        return new Message(word,isPallandrom,message,anagramOfPalindrome);
       }


}
