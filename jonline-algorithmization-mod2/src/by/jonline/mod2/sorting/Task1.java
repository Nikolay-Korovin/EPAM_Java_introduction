package by.jonline.mod2.sorting;

import java.util.Arrays;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

public class Task1 {

	public static void main(String[] args) {

		int k = 3; //номер элемента из первого массива
		int counter = 0;
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 10, 11, 12, 13, 14, 15, 10, 11, 12, 13, 14, 15 };

		int[] array3 = new int[array1.length + array2.length];
		int firstArrayLength = array1.length;
		int secondArrayLength = array2.length;

		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
			counter++;
			if (array3[i] == k) {
				for (int j = 0; j < secondArrayLength; j++) {
					array3[j + i + 1] = array2[j];
				}
				break;
			}
		}

		for (int i = 0; i < firstArrayLength - counter; i++) {
			array3[counter + secondArrayLength] = array1[counter + i];
			secondArrayLength++;
		}

		System.out.println(Arrays.toString(array3));
	}

}
