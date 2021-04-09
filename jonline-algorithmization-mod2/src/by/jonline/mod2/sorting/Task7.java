package by.jonline.mod2.sorting;

import java.util.Arrays;

//7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <=  an и b1 <= b2 <= ... <= bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Task7 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 4, 5, 8, 11, 12, 100 };

		System.out.println("Массив первый " + Arrays.toString(arr1));
		System.out.println("Массив второй " + Arrays.toString(arr2));

		System.out.println("Полученный массив " + Arrays.toString(sortedArrays(arr1, arr2)));

	}

	public static int[] sortedArrays(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int[] arr3 = new int[arr1.length + arr2.length];
		int[] placesArr = new int[arr2.length];

		for (int k = 0; k < arr3.length; k++) {
			if (i == arr1.length) { // условия окончания сравнения (последний элемент массивов)
				arr3[k] = arr2[j];
				placesArr[j] = k;   //записываем позицию вставки в новом массиве
				j = j + 1;
			} else if (j == arr2.length) {  // условия окончания сравнения (последний элемент массивов)
				arr3[k] = arr1[i]; 
				i = i + 1;
			} else if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i = i + 1;
			} else {
				arr3[k] = arr2[j];
				placesArr[j] = k;   //записываем позицию вставки в новом массиве
				j = j + 1;		
			}
		}
		System.out.println("Номера позиций в новом массиве, куда надо вставлять элементы второго массива "
				+ Arrays.toString(placesArr));
		return arr3;
	}

}
