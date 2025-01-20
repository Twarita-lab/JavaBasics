package interviewQuestions;

public class String1PresentInString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "String1";
		String string2 = "Abc String1 present";
		
		int result = string2.indexOf(string1);
		
		if(result==-1) System.out.println(string1 +" is not present in String2");
		else System.out.println(string1 +" is present in String2 at "+ result+" index");
		
	}

}
