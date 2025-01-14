package dsaday1;

public class BinarySearchPracticeQuestion2 {

	public static void main(String[] args) {

		int arr[] = { 2, 2, 3, 4, 5, 5, 5, 6, 8, 11 };
		int sum = 10;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum && arr[i] != Integer.MIN_VALUE) {
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
					arr[i] = Integer.MIN_VALUE;
					arr[j] = Integer.MIN_VALUE;
				}
			}
		}
	}
}
