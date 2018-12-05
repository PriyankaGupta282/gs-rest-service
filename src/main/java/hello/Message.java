package hello;
public class Message {
	
	
	public boolean isPallandrom;
	public String word;
	public String message;
	private boolean anagramOfPalindrome ;
	
	public Message(String word,boolean isPallandrom,String message,boolean anagramOfPalindrome){
		this.isPallandrom = isPallandrom;
		this.word= word;
		this.message = message;
		this.anagramOfPalindrome=anagramOfPalindrome;
	
	}
	
	public boolean isAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}

	public void setAnagramOfPalindrome(boolean anagramOfPalindrome) {
		this.anagramOfPalindrome = anagramOfPalindrome;
	}

	public boolean isPallandrom() {
		return isPallandrom;
	}
	public void setPallandrom(boolean isPallandrom) {
		this.isPallandrom = isPallandrom;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMessage() {
		return message;
	}
	
	


}
