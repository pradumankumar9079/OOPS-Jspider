package com.jspider.filereading5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ActivityUseEverything2_3 {
	public static void main(String[] args) {
		BufferedReader ref = null;
		PrintWriter out = null;
		try {
			ref = new BufferedReader(new FileReader("/home/kali/Desktop/FILEIO/ACTIVITY/a.txt"));
			String line = ref.readLine();
			while (line != null) {
				out.println(line);
				line = ref.readLine();
			}
			ref = new BufferedReader(new FileReader("/home/kali/Desktop/FILEIO/ACTIVITY/b.txt"));
			line = ref.readLine();
			while (line != null) {
				out.println(line);
				line = ref.readLine();
			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ref.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
