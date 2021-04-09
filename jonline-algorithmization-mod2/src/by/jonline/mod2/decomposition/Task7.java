package by.jonline.mod2.decomposition;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {

	public static void main(String[] args) {

		int a = 20;

		System.out.println("сумма факториалов нечётных чисел от 1 до " + a + " = " + oddFactorialSum(a));

	}

	public static long oddFactorialSum(int num) {
		long sum = 0;
		for (int i = 1; i <= num; i = i + 2) {
			sum = sum + factorial(i);
		}
		return sum;
	}

	public static long factorial(int num) {
		long sum = 1;
		for (int i = 1; i <= num; i++) {
			sum = sum * i;
		}
		System.out.println("факториал числа " + num + " = " + sum);
		return sum;
	}

}
