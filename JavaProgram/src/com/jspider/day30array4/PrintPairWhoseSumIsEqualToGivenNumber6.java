package com.jspider.day30array4;

// Print Pair Element Whose sum is equal to Given Number
public class PrintPairWhoseSumIsEqualToGivenNumber6 {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 2, 1 };
		int givenNumber = 4;

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] + a[j] == givenNumber) {
					System.out.println("(" + a[i] + "," + a[j] + ")");
				}
			}
		}
	}
}

//(1,5)
//(2,4)	--> this is also a pair
//(4,2) --> this is different pair
//(5,1)

//if u wanna remove two time 2,4 or 4,2 use boolean array to track record
// once try
