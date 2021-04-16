package by.jonline.mod2.sorting;

import java.util.Arrays;

//3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

public class Task3 {

	public static void main(String[] args) {

		int[] array = { 64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36 };
		// System.out.println(Arrays.toString(array));

		choiceSort(array);

		// System.out.println(Arrays.toString(array));

	}

	public static void choiceSort(int[] array) {
		for (int step = 0; step < array.length; step++) {
			System.out.println(Arrays.toString(array));
			int minIndex = min(array, step);

			int tmp = array[step];
			array[step] = array[minIndex];
			array[minIndex] = tmp;
		}
	}

	public static int min(int[] array, int start) {
		int minIndex = start;
		int minValue = array[start];
		for (int i = start + 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
