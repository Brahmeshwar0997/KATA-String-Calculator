 
public class StringCalculator {
 
 	static int count=0;
	public int Add(String numbers) throws MyException {
		count=count+1;
		numbers = numbers.replace("[", " ").replace("]", " ");
		numbers = numbers.replace("\n", " ");

		String[] terms = numbers.split("[\\s@&.?$+-,://;\\\\n*!#%^()/{}]+");
		int sum = 0;
		for (String string : terms) {
			int num = 0;
			if (!string.isEmpty() ) {
				num = Integer.parseInt(string);
				if(num<1000) {
 				sum = sum + num;
				}
			}
			if (num < 0) {
				throw new MyException("negatives not allowed");
			}

		}
		return sum;

	}

	public int GetCalledCount() {
		return count;
		
	}
}
