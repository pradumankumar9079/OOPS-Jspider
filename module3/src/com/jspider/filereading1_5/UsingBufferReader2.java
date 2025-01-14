package com.jspider.filereading1_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferReader2 {
	public static void main(String[] args) {
		BufferedReader ref = null;
		try {
			ref = new BufferedReader(new FileReader("/home/kali/Desktop/Lalu/raja.txt"));
			String val = ref.readLine();
			while (val != null) {
				System.out.println(val);
				val = ref.readLine();
			}
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
