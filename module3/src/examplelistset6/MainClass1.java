package examplelistset6;

import java.util.ArrayList;

public class MainClass1 {
	public static void main(String[] args) {
//		System.out.println("---------");
		NoteBook b1 = new NoteBook(102, "Class", 45.00, 100);
		NoteBook b2 = new NoteBook(103, "Sulekha", 35.00, 100);
		NoteBook b3 = new NoteBook(105, "Doms", 45.00, 120);
		NoteBook b4 = new NoteBook(101, "Nataraj", 45.00, 100);
		NoteBook b5 = new NoteBook(104, "Apsara", 25.00, 50);

		// using <NoteBook> here so no other type of data allowed no upcasting
		// DownCasting here
		ArrayList<NoteBook> bookList = new ArrayList<NoteBook>();

		// Order Will Not Preserve Here
//		HashSet<NoteBook> bookList = new HashSet<NoteBook>();

		// Order of Insertion Will Be Preserved Here
//		LinkedHashSet<NoteBook> bookList = new LinkedHashSet<NoteBook>();

		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);

		System.out.println("NoteBook Details: ");
		System.out.println("------------------------");
		System.out.println("ID\tBrand\tPrice\tPages");
		System.out.println("-------------------------");
		for (NoteBook book : bookList) {
			System.out.println(book.getId() + "\t" + book.getBrand() + "\t" + book.getPrice() + "\t" + book.getPages());
		}

//		System.out.println("---------");
	}
}
