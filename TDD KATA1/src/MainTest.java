
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCalculator strcalc=new StringCalculator();
		try {
			System.out.println(strcalc.Add("1\n2,3"));
			System.out.println(strcalc.Add("//[***]\\n1***2***3"));
			System.out.println(strcalc.Add("-1\\n-2,3"));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
