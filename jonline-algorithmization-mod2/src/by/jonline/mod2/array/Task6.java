package by.jonline.mod2.array;

//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Task6 {

	public static void main(String[] args) {

		double sum = 0;

		double[] mas = { 0, 3.1, 5, 11, 7.1, 6.1, 8 };

		for (int i = 0; i < mas.length; i++) {
			if (isPrimeNum(i)) {
				sum += mas[i];
			}
		}

		System.out.println("Сумма элементов порядковый номер которых является простым числом = " + sum);

	}

	public static boolean isPrimeNum(int n) {
		for (int i = 2; i < Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
