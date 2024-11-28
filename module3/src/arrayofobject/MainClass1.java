package arrayofobject;

// Here we Are Creating Array of Object Assign and Access Using toString and Tabular Format(SQL Like)

class TextBook {
	int id;
	String title;
	String author;
	int edition;
	double price;

	public TextBook(int id, String title, String author, int edition, double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.price = price;
	}

	// It is always good idea to override toString() method and return state and
	// Behavior

	@Override
	public String toString() {
//		return "TextBooke Instance";
		return "" + this.id + "," + this.title + "," + this.author + "," + this.edition + "," + this.price;
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		// Java Internally Create TextBook Kind Of array
		System.out.println("-------------------------------------");
		TextBook[] books = new TextBook[5];

		books[0] = new TextBook(222, "JAVA", "Pavan", 2, 150.00);
		books[1] = new TextBook(453, "SQL", "Sharath", 2, 250.00);
		books[2] = new TextBook(433, "Web", "Harish", 2, 100.00);
		books[3] = new TextBook(343, "LP", "Sameer", 2, 250.00);
		books[4] = new TextBook(144, "DSA", "Darshan", 2, 350.00);

		System.out.println("Array size" + books.length);

		System.out.println("Book Details");
		System.out.println("-------------------------------------");
		System.out.println("ID\tTitle\tAuthor\tEdition\tPrice");
		System.out.println("-------------------------------------");

		for (int i = 0; i < books.length; i++) {
//			System.out.println(books[i]);
			// Displaying Book Details in a Tabular format without toString

			System.out.println(books[i].id + "\t" + books[i].title + "\t" + books[i].author + "\t" + books[i].edition
					+ "\t" + books[i].price);

		}
		System.out.println("-------------------------------------");

		System.out.println("Book - Price More than 200");
		System.out.println("-------------------------------------");
		System.out.println("ID\tTitle\tAuthor\tEdition\tPrice");
		System.out.println("-------------------------------------");

		for (int i = 0; i < books.length; i++) {
//			System.out.println(b..ooks[i]);
			// Displaying Book Details in a Tabular format without toString

			// Q1) i wanna Print only Details of that book which price is more than 200.

			if (books[i].price > 200) {
				System.out.println(books[i].id + "\t" + books[i].title + "\t" + books[i].author + "\t"
						+ books[i].edition + "\t" + books[i].price);
			}

		}
		System.out.println("-------------------------------------");

		System.out.println("Book Coding Related");
		System.out.println("-------------------------------------");
		System.out.println("ID\tTitle\tAuthor\tEdition\tPrice");
		System.out.println("-------------------------------------");

		for (int i = 0; i < books.length; i++) {
//			System.out.println(books[i]);
			// Displaying Book Details in a Tabular format without toString

			// Q2) i wanna Print only Details of that book which is having title either
			// Jasva
			// or sql or dsa(coding Books)-->it's like filter

			if (!(books[i].title.equalsIgnoreCase("java") || books[i].title.equalsIgnoreCase("lp")
					|| books[i].title.equalsIgnoreCase("dsa"))) {
				System.out.println(books[i].id + "\t" + books[i].title + "\t" + books[i].author + "\t"
						+ books[i].edition + "\t" + books[i].price);
			}

		}
		System.out.println("-------------------------------------");
	}
}
