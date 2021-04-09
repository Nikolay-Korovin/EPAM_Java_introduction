package by.jonline.mod2.decomposition;

//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class Task2 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		int res;

		a = 90;
		b = 30;
		c = 100;
		d = 20;

		res = nod(nod(a, b), nod(c, d));
		System.out.printf("НОД для чисел %3d %3d %3d %3d = %3d ", a, b, c, d, res);

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
