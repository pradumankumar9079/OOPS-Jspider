package com.jspider.filehandlingcrud1_1;

import java.io.File;
import java.io.IOException;

public class CreateFile2 {
	public static void main(String[] args) {
		File ref = new File("/home/kali/Desktop/FILEIO/Demo.txt");
		boolean flag = ref.exists();

		if (flag == false) {
			try {
				ref.createNewFile();
			} catch (IOException e) {
				System.out.println("File Created");
				e.printStackTrace();
			}
		} else {
			System.out.println("File Already Exits");
		}
	}
}
