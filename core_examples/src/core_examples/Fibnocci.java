package core_examples;

public class Fibnocci {

	public static void main(String[] args) {

		int n = 10;

		int a = 0, b = 1;

		for (int i = 0; i < n; i++) {
			System.out.println(a + "");

			int temp = a;
			a = b;
			b = temp + a;
		}

	}

}
