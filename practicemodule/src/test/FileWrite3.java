package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite3 {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bf = null;
		PrintWriter pw = null;
		try {
			/*******************************/
//			fw = new FileWriter("/home/kali/Desktop/Raj/raja.txt");
//
//			fw.write("Raja\n");
//			fw.write("\n");
//			fw.write(66);
//			char ch[] = { 'a', 'b', 'c' };// only char array not int or string
//			fw.write("\n");
//			fw.write(ch);
//			fw.flush();
//			System.out.println("Written");
			/*******************************/

			/*******************************/
//			bf = new BufferedWriter(new FileWriter("/home/kali/Desktop/Raj/raja.txt"));// --> focus
//
//			bf.write("Raja Bhai");
//			bf.newLine();// Introduced
//			bf.write(66);// Still ASCII
//			char ch1[] = { 'a', 'b', 'c' };// only char array not int or string
//			bf.write("\n");
//			bf.write(ch1);
//			bf.flush();
//			System.out.println("Written");
			/*******************************/

			/*******************************/
			pw = new PrintWriter("/home/kali/Desktop/Raj/raja.txt");// --> again n need
			pw.println("Raja Bhai Hai Mera Yaar");
			pw.println();// Introduced
			pw.println(66);// getting Integer
			char ch2[] = { 'a', 'b', 'c' };// only char array not int or string
			pw.print(ch2);
			pw.println();
			pw.flush();
			System.out.println("Written");
			/*******************************/

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
