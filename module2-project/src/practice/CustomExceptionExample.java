package practice;

class CustomException extends Exception {
	public String toString() {
		return "Got Exception";
	}
}

class EligibleForDriving {
	static void checkAge(int age) throws CustomException {
		if (age <= 18)
			throw new CustomException();
	}
}

public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			EligibleForDriving.checkAge(0);
		} catch (CustomException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Done");
		}
	}
}
