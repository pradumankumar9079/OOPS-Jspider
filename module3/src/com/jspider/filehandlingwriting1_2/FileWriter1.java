package com.jspider.filehandlingwriting1_2;

import java.io.FileWriter;
import java.io.IOException;

// Each Time it ReWrite Complete File So Old Gone
// or use true

// Drawback Manual Line Seperate and number converted into Unicode

// Every Line of Code is Risky here so throws is also working
// or try catch

public class FileWriter1 {
	public static void main(String[] args) {
		FileWriter ref = null;
		try {
			ref = new FileWriter("/home/kali/Desktop/FILEIO/Demo.txt", true);
			ref.write("ABC");
			// If Not Providing Line Seprate we will EveryThing in Same Line

			ref.write("\n");
			ref.write(65);
			ref.write("\n");
			char ch[] = { 'J', 'A', 'V', 'A' };
			ref.write(ch);
			ref.flush();
			System.out.println("Write Completed");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ref.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
