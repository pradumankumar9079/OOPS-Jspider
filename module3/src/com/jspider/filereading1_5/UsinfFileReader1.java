package com.jspider.filereading1_5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Read character By Character
// in two case we will get -1 reached eof or empty file
public class UsinfFileReader1 {

	public static void main(String[] args) {
		FileReader ref = null;
		try {
			ref = new FileReader("/home/kali/Desktop/Lalu/raja.txt");
			int val = ref.read();// This is Unicode Character By Character
			while (val != -1) {
				System.out.print((char) val);
				val = ref.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
