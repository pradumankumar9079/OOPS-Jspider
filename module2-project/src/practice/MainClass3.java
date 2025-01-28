package practice;

import java.util.Scanner;

public class MainClass3 {
	public static void reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}
		System.out.println(rev);
	}

	public static void decToBinary(int dec) {
		String bin = "";
		while (dec > 0) {
			int rem = dec % 2;
			bin = rem + bin;
			dec = dec / 2;

		}
		System.out.println(bin);
	}

	public static void decToHex(int dec) {
		String hex = "";
		while (dec > 0) {
			int rem = dec % 16;
			if (rem > 9) {
				hex = (char) (rem + 87) + hex;
			} else {
				hex = rem + hex;
			}
			dec = dec / 16;

		}
		System.out.println(hex);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int dec = sc.nextInt();
//		decToBinary(dec);
		reverse(3456);
		decToHex(202);
	}
}
