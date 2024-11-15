package inheritance;

class InstagramOld {
	void post() {
		System.out.println("Upload Photo");
	}
}

class InstagramNew extends InstagramOld {
	void message() {
		System.out.println("Send Message");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		InstagramOld i1 = new InstagramOld();
		i1.post();

		InstagramNew i2 = new InstagramNew();
		i2.post();
		i2.message();
	}
}
