package interviewQuestions;

public class StringSplitter_DTCC {

	public static void main(String[] args) {
		
		String s = "Asddjbk365765@#$@%$^&bkjbjsd";
		
		
		//In this solution it creates a new memory, when each time the String is modified
		String letters="";
		String numbers="";
		String specialCharacters = "";
		

		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) letters=letters+s.charAt(i);
			else if(Character.isDigit(s.charAt(i))) numbers=numbers+s.charAt(i);
			else specialCharacters=specialCharacters+s.charAt(i);
			
		}
		System.out.println(letters+"\n"+numbers+"\n"+specialCharacters);
		
		 System.out.println("---------------------------------------------------------------------------------");
		
		//This solution is much space efficient and faster, though not thread safe
		StringBuilder lettersSB = new StringBuilder();
		StringBuilder numbersSB = new StringBuilder();
		StringBuilder specialCharactersSB = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) lettersSB.append(s.charAt(i));
			else if(Character.isDigit(s.charAt(i))) numbersSB.append(s.charAt(i));
			else specialCharactersSB.append(s.charAt(i));
			
		}
		System.out.println(lettersSB+"\n"+numbersSB+"\n"+specialCharactersSB);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		//This solution is space efficient and thread safe, but slow
				StringBuffer lettersSBf = new StringBuffer();
				StringBuffer numbersSBf= new StringBuffer();
				StringBuffer specialCharactersSBf = new StringBuffer();
				
				for(int i=0; i<s.length(); i++) {
					if(Character.isAlphabetic(s.charAt(i))) lettersSBf.append(s.charAt(i));
					else if(Character.isDigit(s.charAt(i))) numbersSBf.append(s.charAt(i));
					else specialCharactersSBf.append(s.charAt(i));
					
				}
				System.out.println(lettersSBf+"\n"+numbersSBf+"\n"+specialCharactersSBf);
				
	}

}
