package arrayofobjectday1;

public class NoteBook1 extends Book {
	String type;
	String size;

	public NoteBook1(int id, int page, String coverBind, double price, String type, String size) {
		super(id, page, coverBind, price);
		this.type = type;
		this.size = size;

	}

	// Generated Form Source
	@Override
	public String toString() {
		return "NoteBook1 [type=" + type + ", size=" + size + "]";
	}
}
