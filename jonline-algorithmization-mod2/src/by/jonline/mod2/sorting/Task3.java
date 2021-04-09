package by.jonline.mod2.sorting;

import java.util.Arrays;

//3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

public class Task3 {

	public static void main(String[] args) {

		int[] array = { 10, 11, 12, 13, 14, 15 };
		System.out.println(Arrays.toString(array));

		for (int left = 0; left < array.length; left++) {
			int minInd = left;
			for (int i = left; i < array.length; i++) {
				if (array[i] > array[left]) {
					minInd = i;
				}
			}
			swap(array, left, minInd);
		}
		System.out.println(Arrays.toString(array));

	}

	public static void swap(int[] arr, int ind1, int ind2) {
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}

}
