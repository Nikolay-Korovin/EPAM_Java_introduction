package by.jonline.mod2.decomposition;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

public class Task8 {

	public static void main(String[] args) {

		int k;
		int m;
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		k = 3;
		m = 6;

		elementSum(array, k, m);

	}

	public static int elementSum(int[] arr, int k, int m) {
		int sum = 0;

		if (arr.length < m || arr.length < k) {
			System.out.println("Массив для этого промежутка не подходит");
		} else {
			for (int i = k - 1; i < m; i++) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Сумма чисел от " + 3 + " элемента до " + m + " = " + sum);
		return sum;

	}

}
