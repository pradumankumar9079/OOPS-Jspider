package arrayofobjectday1;

public class TextBook1 extends Book {

	String title;
	String author;
	int edition;

	public TextBook1(int id, int pages, String coverBind, double price, String title, String author, int edition) {
		super(id, pages, coverBind, price);
		this.title = title;
		this.author = author;
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "TextBook1 [title=" + title + ", author=" + author + ", edition=" + edition + "]";
	}

}
