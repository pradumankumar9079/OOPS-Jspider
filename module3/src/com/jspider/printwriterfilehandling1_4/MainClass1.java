package com.jspider.printwriterfilehandling1_4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainClass1 {
	public static void main(String[] args) {
		PrintWriter ref = null;
		try {
			ref = new PrintWriter("/home/kali/Desktop/FILEIO/Game.txt");
			ref.println("Java");
			ref.println("Sql");
			ref.println("Web");
			ref.println(65);
			ref.flush();
			System.out.println("Write Completed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			ref.close();
		}

	}
}
