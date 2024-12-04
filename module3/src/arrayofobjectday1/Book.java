package arrayofobjectday1;

// we will not create object of this because book does not exist
public abstract class Book {
	int id;
	int pages;
	String coverBind;
	double price;

	public Book(int id, int pages, String coverBind, double price) {
		super();
		this.id = id;
		this.pages = pages;
		this.coverBind = coverBind;
		this.price = price;
	}

	// Generated Form Source
	@Override
	public String toString() {
		return "Book1 [id=" + id + ", pages=" + pages + ", coverBind=" + coverBind + ", price=" + price + "]";
	}

	// Written By Me
//	public static void main(String[] args) {
//		Book1 b = new Book1(1, 2, "dd", 234);
//		System.out.println(b);
//	}
}
