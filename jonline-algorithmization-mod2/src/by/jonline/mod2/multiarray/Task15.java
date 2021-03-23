package by.jonline.mod2.multiarray;

import java.util.Arrays;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {

	public static void main(String[] args) {

		int array[][] = { { 4, 2, 3, 1 }, { 4, 1, 2, 9 }, { 1000, 8, 1, 7 }, { 1, 0, 3, 2 } };
		int maxEle = array[0][0];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (maxEle < array[i][j]) {
					maxEle = array[i][j];
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 != 0) {
					array[i][j] = maxEle;
				}
			}
		}

		System.out.println("Максимальный элемент матрицы : " + maxEle);
		System.out.println(Arrays.deepToString(array));

	}

}
