package by.jonline.mod2.sorting;

import java.util.Arrays;

// Сортировка вставками. Дана последовательность чисел a1 ,a2 ,...,an. Требуется переставить числа в порядке
// возрастания.

public class Task5 {

	public static void main(String[] args) {

		int[] array = { 4, 3, 2, 1 };
		System.out.println("Дан массив " + Arrays.toString(array));

		insertionSort(array);

		System.out.println("Получен массив " + Arrays.toString(array));
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i;
			while (j > 0 && array[j - 1] > current) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = current;
		}
	}

}
