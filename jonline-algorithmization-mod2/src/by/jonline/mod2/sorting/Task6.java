package by.jonline.mod2.sorting;

import java.util.Arrays;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai < ai+1, то продвигаютсяна один элемент вперед.
//Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.

//подглядывал, разобрать подробно ещё раз
public class Task6 {

	public static void main(String[] args) {
		double temp;
		double[] arr = { 4, 5, 2, 1 };
		System.out.println("Дан массив");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				for (int j = i-1; j > -1; j--) {
					if (arr[j] > arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
					else break;
				}
			}
		}

		System.out.println("Получен массив");
		System.out.println(Arrays.toString(arr));
	}

}
