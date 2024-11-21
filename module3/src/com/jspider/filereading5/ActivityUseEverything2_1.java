package com.jspider.filereading5;

import java.io.File;
import java.io.IOException;

public class ActivityUseEverything2_1 {
	public static void main(String[] args) {
		File ref = new File("/home/kali/Desktop/FILEIO/ACTIVITY/c.txt");
		boolean flag = ref.exists();
		if (flag == false) {
			try {
				ref.createNewFile();
				System.out.println("File Created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File Already Exist");
		}

	}
}
