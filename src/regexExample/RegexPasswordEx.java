package regexExample;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//min length, max15, no 3 consecutive char,atleast one alphabet and number and special char

public class RegexPasswordEx {

	public static void main(String[] args) {
		List <String> passwords = Arrays.asList("madagascar1!", "bahubali2");
		
		
		//regex format for min and max length, atleast one alphabet, number and a special char
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&+=]).{8,15}$";
		
		//compile the regex
		Pattern p = Pattern.compile(regex);
		
		for(String password : passwords) {
			
			//pattern class contains matcher() method
			//finds if it satisfies the password requirements
			Matcher m = p.matcher(password);
			
			if (m.matches()) {
				System.out.printf("%s matches%n", password);
				
			}else {
				System.out.printf("%s does not matches", password);
			}
		}

	}

}
