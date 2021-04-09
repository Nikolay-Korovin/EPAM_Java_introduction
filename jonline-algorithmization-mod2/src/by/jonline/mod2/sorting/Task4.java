package by.jonline.mod2.sorting;

import java.util.Arrays;

//4. Сортировка обменами(пузыри). Дана последовательность чисел a1 >= a2 >= ... >= an.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class Task4 {

	public static void main(String[] args) {

		int[] array = { 15, 14, 13, 12, 11, 10 };
		int k = 0;
		System.out.println("Дан массив");
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {
					int num = array[j];
					array[j] = array[j + 1];
					array[j + 1] = num;
					k += 1;
				}

			}

		}
		System.out.println("Получен массив");
		System.out.println(Arrays.toString(array));
		System.out.println("Количество перестановок: " + k);

	}

}
