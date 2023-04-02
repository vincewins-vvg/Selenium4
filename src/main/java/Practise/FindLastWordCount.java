package Practise;

public class FindLastWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: s = "Hello World"
//				Output: 5
//				Explanation: The last word is "World" with length 5.
		int length=0;
		String s ="Hello World";
		int lastWord = s.substring(6).length();
		System.out.println("Length: "+lastWord);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) ==' ')
			{
				//length will be set to 0 before 
				// on encountering the last space and the
				//count will be incremented
				length=0;
				
			}
			else
			{
				length++;
			}
			
			
		}
		System.out.println(length);

	}

}
