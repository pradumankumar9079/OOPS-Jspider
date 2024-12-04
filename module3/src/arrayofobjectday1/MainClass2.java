package arrayofobjectday1;

public class MainClass2 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Book[] books = new Book[5];

		// Every Book Is UpCasted To Book
		books[0] = new NoteBook1(343, 200, "Hard", 100, "Ruled", "Long");
		books[1] = new TextBook1(455, 250, "soft", 500.00, "Java", "Pavan", 2);
		books[2] = new NoteBook1(343, 200, "Hard", 100, "Ruled", "Long");
		books[3] = new TextBook1(543, 350, "soft", 250.00, "SQL", "Sharath", 2);
		books[4] = new NoteBook1(453, 200, "Soft", 125.00, "Unruled", "Long");

		System.out.println("Book Details");
		System.out.println("------------------------------");
		// Here Firstly identify and than print Details after down casting
		// firstly check instance of child at last check for parent
		for (int i = 0; i < books.length; i++) {
			if (books[i] instanceof NoteBook1) {
				NoteBook1 nb = (NoteBook1) (books[i]);
				System.out.println(nb.id + "\t" + nb.pages + "\t" + nb.coverBind + "\t" + nb.price + "\t" + nb.type
						+ "\t" + nb.size);

			} else if (books[i] instanceof TextBook1) {
				TextBook1 tb = (TextBook1) books[i];
				System.out.println(tb.id + "\t" + tb.pages + "\t" + tb.coverBind + "\t" + tb.price + "\t" + tb.title
						+ "\t" + tb.author + "\t" + tb.edition);
			} else if (books[i] instanceof Book) {
				System.out.println(
						books[i].id + "\t" + books[i].pages + "\t" + books[i].coverBind + "\t" + books[i].price);
			}
		}

		System.out.println("Main Method Ended");
	}
}
