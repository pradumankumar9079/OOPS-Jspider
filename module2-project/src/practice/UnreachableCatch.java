package practice;

// Unreachable Catch Block Example--> Compilation Error
public class UnreachableCatch {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		} catch (ArithmeticException a) {
			a.printStackTrace();
		}
	}
}
