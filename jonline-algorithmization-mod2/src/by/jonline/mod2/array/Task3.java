package by.jonline.mod2.array;

import java.util.Arrays;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Task3 {

	public static void main(String[] args) {

		double[] mas = { 0, 1.1, 0.2, -14.3, 0.01, 4, 0 };
		int posEle = 0;
		int negEle = 0;
		int zeroEle = 0;

		for (double e : mas) {
			if (e > 0) {
				posEle++;
			} else if (e < 0) {
				negEle++;
			} else {
				zeroEle++;
			}
		}

		System.out.println("В массиве: " + Arrays.toString(mas));
		System.out.println("Отрицательных элементов : " + negEle);
		System.out.println("Положительных элементов : " + posEle);
		System.out.println("Нулевых элементов : " + zeroEle);

	}

}
