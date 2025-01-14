package test;

import java.io.FileReader;
import java.io.IOException;

public class FileRead4 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/home/kali/Desktop/Lalu/raja.txt");
			char ch = (char) fr.read();
			while (ch != -1) {
				System.out.println(ch);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
