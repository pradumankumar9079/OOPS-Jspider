package practice;

class Connection {
	private Connection() {

	}

	private static Connection con = null;

	public static Connection getConnection() {
		if (con == null) {
			con = new Connection();
		}
		return con;
	}
}

public class SingletonClass {
	public static void main(String[] args) {
		Connection con1 = Connection.getConnection();
		System.out.println(con1);
		Connection con2 = Connection.getConnection();
		System.out.println(con2);
		Connection con3 = Connection.getConnection();
		System.out.println(con3);
	}
}
