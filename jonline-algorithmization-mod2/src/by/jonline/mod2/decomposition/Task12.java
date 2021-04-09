package by.jonline.mod2.decomposition;

import java.util.Arrays;

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.
//НЕ ДОДЕЛАНО
public class Task12 {

	public static void main(String[] args) {

		int k = 5;
		int n = 4;
		int arrayLength = 10;

		numberGenerator(k, n);
		createArray(k, n, arrayLength);

	}

	public static int[] createArray(int k, int n, int arrLeng) {
		int[] array = new int[arrLeng]; // размер требуемого массива явно не указан, по этому берём например 10
		int[][] sourceArr = numberGenerator(k, n);
		System.out.println(Arrays.deepToString(sourceArr));
		int counter = 0;
		while (counter != array.length) {

		}

		return array;
	}

	public static int[][] numberGenerator(int k, int n) {
		// int[] arr = new int[k - 1];
		// int[] arrReverse = new int[k - 1];
		int[][] array = new int[2][k - 1];

		for (int i = 1, j = k - 1; i < k; i++, j--) {
			// arr[i - 1] = i;
			// arrReverse[i - 1] = j;
			array[0][i - 1] = i;
			array[1][i - 1] = j;
		}
		return array;

	}

}
