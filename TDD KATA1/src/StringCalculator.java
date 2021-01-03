
public class StringCalculator {

	public int Add(String numbers) throws MyException {
		String[] terms = numbers.split("[\\s@&.?$+-,://;\\n]+");
		int sum=0;
		for (String string : terms) {
			int num=Integer.parseInt(string);
			if(num<0) {
				throw new MyException("negatives not allowed");
			}
			sum=sum+num;

		}
		return sum;
		
	}
}
