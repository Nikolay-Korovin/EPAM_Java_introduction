package by.jonline.mod2.sorting;

import java.util.Arrays;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
// Составить алгоритм этой сортировки.

public class Task6 {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1 };

		System.out.println(Arrays.toString(arr));

		shellSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void shellSort(int[] array) {
		int step = array.length / 2;    												//значение шага 
		for (; step > 0;) { 															//до тех пор пока длина шага больше чем ноль
			for (int i = step; i < array.length; i++) {									//проход  от индекса равного шагу до конца массива( с шагом в 1 )
				for (int j = i; j >= step && array[j] < array[j - step]; j -= step) { 	//до тех пор пока j больше или равно шагу и jэлемент меньше jэлемент-шаг 
					int tmp = array[j];												 	//и на каждой итерации j уменьшается на шаг
					array[j] = array[j - step];											//меняем местами элементы на j и на j-шаг
					array[j - step] = tmp;
				}
			}
			step = step / 2;															//уменьшаем шаг в 2 раза
		}
	}

}
