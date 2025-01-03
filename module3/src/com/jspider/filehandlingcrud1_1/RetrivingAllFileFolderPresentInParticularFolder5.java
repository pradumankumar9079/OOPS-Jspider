package com.jspider.filehandlingcrud1_1;

import java.io.File;

public class RetrivingAllFileFolderPresentInParticularFolder5 {
	public static void main(String[] args) {
		File ref = new File("/home/kali/Desktop/FILEIO");
		/*********** Used One Of Constructor *****/
		// I Can also Write Like this
//		File ref1 = new File("/home", "/Kali/Desktop/FILEIO");
		/*****************************************/
		String[] arr = ref.list();

		for (int i = 0; i <= arr.length - 1; i++) {

			// Displaying File and Folder Separately
//			System.out.println("========File==========");
			File obj = new File(ref, arr[i]);
			boolean flag = obj.isFile();
			if (flag == true) {
				System.out.print(arr[i] + " ");
			}
//			System.out.println("=======Folder==============");
//			boolean flag1 = obj.isDirectory();
//			if (flag1 == true) {
//				System.out.println(arr[i] + " ");
//			}
		}
	}
}
