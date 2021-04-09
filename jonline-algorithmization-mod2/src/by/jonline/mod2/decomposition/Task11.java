package by.jonline.mod2.decomposition;

//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task11 {

	public static void main(String[] args) {

		int a = 1011;
		int b = 15511;

		compareIt(a, b);

	}

	public static void compareIt(int a, int b) {
		int tempA = a;
		int tempB = b;
		int counterA = 0;
		int counterB = 0;

		while (a != 0) {
			a = a / 10;
			counterA++;
		}

		while (b != 0) {
			b = b / 10;
			counterB++;
		}

		if (counterA > counterB) {
			System.out.println("В числе " + tempA + " больше цифр чем в " + tempB);
		} else {
			System.out.println("В числе " + tempB + " больше цифр чем в " + tempA);
		}
	}

}
