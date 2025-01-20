package interviewQuestions;

public class StringReverse_CognizantInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Abcdef";
		char[] strChar = str.toCharArray();
		String reveresed_str = "";
		
		for(int i=str.length(); i>0; i--) {
			reveresed_str=reveresed_str+strChar[i-1];
		}
		
		System.out.println("Reverse of "+str+ " is "+reveresed_str);
	}

}
