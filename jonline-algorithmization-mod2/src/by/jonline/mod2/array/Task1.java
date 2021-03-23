package by.jonline.mod2.array;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {

	public static void main(String[] args) {
		int sum = 0;
		int k = 2;
		int n = 12;
		int[] mas = new int[n];

		for (int i = 0; i < n; i++) {
			mas[i] = i + 1;
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}
		System.out.println("Сумма элементов массива кратных k = " + sum);

	}

}
