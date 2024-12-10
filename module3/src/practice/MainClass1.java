package practice;

import java.io.File;
import java.io.IOException;

public class MainClass1 {
	public static void main(String[] args) throws IOException {
		File ref = new File("/home/kali/Desktop");
		String[] arr = ref.list();
//		System.out.println(Arrays.toString(arr));

//		for (int i = 0; i <= arr.length - 1; i++) {
//			if (ref.isDirectory() == true) {
//				System.out.println(arr[i]);
//			}
//		}
		for (int i = 0; i <= arr.length - 1; i++) {
			File obj = new File(ref, arr[i]);
			if (obj.isDirectory() == true) {
				System.out.println(arr[i]);
			}
		}
	}
}
