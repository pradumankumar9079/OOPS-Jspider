package oops;

class Game implements Cloneable {
	int hiscore;

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Clone8 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Game c = new Game();
		Game c1 = (Game) c.clone();
		System.out.println(c);
		System.out.println(c1);
	}
}
