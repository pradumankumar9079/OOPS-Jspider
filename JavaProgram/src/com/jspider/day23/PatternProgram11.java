package com.jspider.day23;

/*
1 2 3 4 5 
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 
*/
public class PatternProgram11 {
	public static void main(String[] args) {
		int n = 5;
//		int k = 1;// We Can Also Use this
		for (int i = 1; i <= n; i++) {
			int x = i;// Or This
			for (int j = 1; j <= n; j++) {
				System.out.print(x + " ");
				x++;
			}
//			k = i + 1;
			System.out.println();
		}
	}

}
