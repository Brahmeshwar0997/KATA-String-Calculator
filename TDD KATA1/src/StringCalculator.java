import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
 
	Pattern p = Pattern.compile("[\\s@&.?$+-,://;\\n*!#%^()/{}]+");

	public int Add(String numbers) throws MyException {
		numbers = numbers.replace("[", "").replace("]", "");
		numbers = numbers.replace("\n", "");

		String[] terms = numbers.split("[\\s@&.?$+-,://;\\\\n*!#%^()/{}]+");
	   int sum=0;
		for (String string : terms) {
 			int num=0;
 			if(!string.isEmpty()) {
				  num=Integer.parseInt(string);
			}
			if(num<0) {
				throw new MyException("negatives not allowed");
			}
			sum=sum+num;

		}
		return sum;
		
	}
}
