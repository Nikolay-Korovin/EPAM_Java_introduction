package by.jonline.mod2.decomposition;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 13;

		mutuallySimple(a, b, c);

	}

	public static void mutuallySimple(int a, int b, int c) {
		if (nod(a, b) + nod(a, c) + nod(b, c) == 3) {
			System.out.printf("Числа : %d %d %d являются взаимно простыми", a, b, c);
		} else {
			System.out.printf("Числа : %d %d %d не являются взаимно простыми", a, b, c);
		}
	}

	public static int nod(int a, int b) {

		while (a != 0 && b != 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}

		return a + b;
	}

}
