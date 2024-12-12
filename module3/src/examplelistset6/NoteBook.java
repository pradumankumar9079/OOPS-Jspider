package examplelistset6;

// Bean Class Structure is good Try To Follow it
public class NoteBook {
	private int id;
	private String brand;
	private double price;
	private int pages;

	public NoteBook(int id, String brand, double price, int pages) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
