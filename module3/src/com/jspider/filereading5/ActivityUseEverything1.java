package com.jspider.filereading5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

// Here We Are Printing That Particular Directory FileName in a File Called list.txt
public class ActivityUseEverything1 {
	public static void main(String[] args) {
		File ref = new File("/home/kali/Desktop/FILEIO/list.txt");
		boolean flag = ref.exists();
		PrintWriter pw = null;
		if (flag == false) {
			try {
				ref.createNewFile();
				File obj = new File("/home/kali/Desktop/FILEIO");
				String[] arr = obj.list();
				pw = new PrintWriter(ref);
				for (int i = 0; i <= arr.length - 1; i++) {
					pw.println(arr[i]);
				}
				pw.flush();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				pw.close();
			}
		}
	}
}
