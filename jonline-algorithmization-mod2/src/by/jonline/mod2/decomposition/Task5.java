package by.jonline.mod2.decomposition;

import java.util.Arrays;
import java.util.Random;

//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).

public class Task5 {

	public static void main(String[] args) {

		int n = 10;
		int[] array = new int[n];

		fillArray(array);
		System.out.print("Дан массив : ");
		System.out.println(Arrays.toString(array));

		scndMaxNum(array);

	}

	public static void scndMaxNum(int[] arr) {
		int[] array = sort(arr);
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				System.out.println("Второе по величине число в массиве : " + array[i]);
				break;
			}
		}

	}

	public static void fillArray(int[] arr) {

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(21);
		}

	}

	public static int[] sort(int[] arr) {
		int[] tempArr = arr;
		for (int i = 0; i < tempArr.length; i++) {
			for (int j = 0; j < tempArr.length; j++) {
				if (tempArr[i] >= tempArr[j]) {
					int temp = tempArr[j];
					tempArr[j] = tempArr[i];
					tempArr[i] = temp;
				}
			}
		}
		return tempArr;
	}

}
