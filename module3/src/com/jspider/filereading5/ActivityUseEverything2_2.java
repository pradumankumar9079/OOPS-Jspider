package com.jspider.filereading5;

import java.io.IOException;
import java.io.PrintWriter;

public class ActivityUseEverything2_2 {
	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("/home/kali/Desktop/FILEIO/ACTIVITY/b.txt");
			pw.println("TESTING");
			pw.println("JAVA");
			pw.println("PYTHON");
			pw.println("BANKING");
			pw.flush();
			System.out.println("Written");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
}
