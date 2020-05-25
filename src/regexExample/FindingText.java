package regexExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingText {

	public static void main(String[] args) {
		try {
			File myObj = new File("/Users/ruchina/eclipse-workspace/RegexAssignments/src/regexExample/hello.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				//System.out.println(data);
				
				Pattern p = Pattern.compile("Expression");
				Matcher m = p.matcher(data);
				
				if (m.find()) {
					System.out.println(m);
					
				}
						
			}
			
			myReader.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
