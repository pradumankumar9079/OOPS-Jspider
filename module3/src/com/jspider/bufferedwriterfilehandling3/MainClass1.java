package com.jspider.bufferedwriterfilehandling3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass1 {
	public static void main(String[] args) {
		BufferedWriter ref = null;
		try {
			ref = new BufferedWriter(new FileWriter("/home/kali/Desktop/FILEIO/Game.txt"));
			// if file is not present it will create file than write
			ref.write("Jspiders");
			ref.newLine();// Only One Advantage In Compare to File Writer it provide newLine Method
			ref.write(97);// print a
			ref.newLine();
			char[] ch = { 'T', 'I', 'G', 'E', 'R' };
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
