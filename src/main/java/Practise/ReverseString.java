package Practise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "kHg8mRLqx@5D-ZIG1y";
		char[] ch = str.toCharArray();
		//using string builder
	StringBuilder sb = new StringBuilder();
	sb.append(str);
    sb.reverse();
    System.out.println(sb);
		for (int i=ch.length-1;i >= 0; i--) {
			
			System.out.print(ch[i]);
			
		}

	}

}
