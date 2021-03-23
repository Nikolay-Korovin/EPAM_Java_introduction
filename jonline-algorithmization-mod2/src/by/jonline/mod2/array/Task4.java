package by.jonline.mod2.array;

import java.util.Arrays;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task4 {

	public static void main(String[] args) {

		double[] mas = { 15, 1.1, 0.2, -14.3, 0.01, 4, 0 };
		double max = mas[0];
		double min = mas[0];
		int maxInd = 0;
		int minInd = 0;

		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				maxInd++;
			}
			if (min > mas[i]) {
				min = mas[i];
				minInd++;
			}
		}

		System.out.println("Заданный массив : " + Arrays.toString(mas));
		mas[maxInd] = min;
		mas[minInd] = max;
		System.out.println("Полученный массив : " + Arrays.toString(mas));

	}

}
