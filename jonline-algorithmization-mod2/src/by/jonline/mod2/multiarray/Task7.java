package by.jonline.mod2.multiarray;

import java.util.Arrays;

//Сформировать квадратную матрицу порядка N по правилу: a[i, j] = sin((i^2 - j^2)/n)
//и подсчитать количество положительных элементов в ней

public class Task7 {

	public static void main(String[] args) {
		int counter = 0;
		int n = 3;
		double[][] array = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = Math.sin((i * i - j * j) / n);
				if (array[i][j] > 0) {
					counter++;
				}
			}
		}

		System.out.println(Arrays.deepToString(array));

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.printf("%7.3f", array[i][j]);
			}
			System.out.println("");
		}
		System.out.println("Положительеных элементов в матрице : " + counter);

	}

}
