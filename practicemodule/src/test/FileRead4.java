package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead4 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
//			fr = new FileReader("/home/kali/Desktop/Raj/raja.txt");
			br = new BufferedReader(new FileReader("/home/kali/Desktop/Raj/raja.txt"));
//			int val = fr.read();

			String str = br.readLine();
			while (str != null) {
//				val != -1
//				System.out.print((char) val);
//				val = fr.read();

				System.out.println(str);
				str = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
