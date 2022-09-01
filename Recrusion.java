package masi;

public class Recrusion {
	 static void out() {
		System.out.println("Data shown");
		out();
	}
	public static void main(String[] args) {
		out();
	}

}