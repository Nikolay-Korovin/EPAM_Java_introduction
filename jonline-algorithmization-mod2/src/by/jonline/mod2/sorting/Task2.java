package by.jonline.mod2.sorting;

import java.util.Arrays;

//2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm
//Образовать из них новую последовательностьчисел так, чтобы она тоже была неубывающей.
//Примечание. Дополнительный массив не использовать.

public class Task2 {

	public static void main(String[] args) {

		int[] array1 = { 10, 11, 12, 13, 14, 15 };
		int[] array2 = { 1, 2, 3, 10, 11 };

		int[] array3 = new int[array1.length + array2.length];
		int count = 0;

		for (int i = 0; i < array1.length; i++) {// заполняем
			array3[i] = array1[i];
			count++;
		}

		for (int j = 0; j < array2.length; j++) {// заполняем
			array3[count++] = array2[j];
		}

		for (int i = array3.length - 1; i >= 1; i--) {// сортируем
			for (int j = 0; j < i; j++) {
				if (array3[j] > array3[j + 1]) {
					int num = array3[j];
					array3[j] = array3[j + 1];
					array3[j + 1] = num;
				}
			}
		}

		System.out.println(Arrays.toString(array3));
	}

}