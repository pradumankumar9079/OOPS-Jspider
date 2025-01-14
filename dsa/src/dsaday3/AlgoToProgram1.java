package dsaday3;

// Write Algo for this
public class AlgoToProgram1 {

	public static void main(String[] args) {
		int year;
		year = 2002;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}
}
