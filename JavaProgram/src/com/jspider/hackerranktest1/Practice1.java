package com.jspider.hackerranktest1;

public class Practice1 {
	public static void main(String[] args) {
		int n = 5784;
		int realNo = n;
		boolean b = true;
		while (n > 0) {
			int rem = n % 10;
			if (!isUnique(rem, realNo)) {
				b = false;
				break;
			}
			n /= 10;
		}
		if (b) {
			System.out.println("Unique");
		} else {
			System.out.println("Not Unique");
		}
	}

	static boolean isUnique(int rem, int realNo) {
		int cnt = 0;
		while (rem > 0) {
			int r = realNo % 10;
			if (r == rem) {
				cnt++;
			}
			realNo /= 10;

		}

		return cnt == 1;

	}

}
