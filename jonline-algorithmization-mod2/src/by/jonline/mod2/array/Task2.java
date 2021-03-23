package by.jonline.mod2.array;

import java.util.Arrays;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class Task2 {

	public static void main(String[] args) {
		double z = 1.1;
		double[] mas = { 1, 3.1, 0.1, 14, -5, -1.1 };
		int count = 0;

		System.out.println("Дана последовательность:");
		System.out.println(Arrays.toString(mas));

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}

		System.out.println("Заменили все элементы больше чем " + z);
		System.out.println(Arrays.toString(mas));
		System.out.println("Количество замен = " + count);

	}

}
