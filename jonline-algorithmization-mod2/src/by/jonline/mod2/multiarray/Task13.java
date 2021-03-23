package by.jonline.mod2.multiarray;

// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.

public class Task13 {

	public static void main(String[] args) {
		int k = 0;
		int t = 0;
		int array[][] = { { 4, 2, 3, 1 }, { 4, 1, 2, 9 }, { 0, 8, 1, 7 }, { 1, 0, 3, 2 } };

		int column[] = new int[array.length];

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length; i++) {
				column[i] = array[i][j];
			}

			decreaseSort(column);

			for (int e = 0, q = k; e < array.length; e++) {
				array[e][q] = column[e];
			}

			k++;
		}
		printArray(array);
		System.out.println();

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length; i++) {
				column[i] = array[i][j];
			}

			riseSort(column);

			for (int e = 0, q = t; e < array.length; e++) {
				array[e][q] = column[e];
			}

			t++;
		}
		printArray(array);

	}

	public static int[] decreaseSort(int[] arr) {
		for (int i = arr.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[j + 1]) {
					int num = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = num;
				}
			}
		}
		return arr;
	}

	public static int[] riseSort(int[] arr) {
		for (int i = arr.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {

				if (arr[j] > arr[j + 1]) {
					int num = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = num;
				}
			}

		}
		return arr;
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
