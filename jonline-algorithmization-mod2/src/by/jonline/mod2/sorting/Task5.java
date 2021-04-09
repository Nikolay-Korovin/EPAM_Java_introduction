package by.jonline.mod2.sorting;

import java.util.Arrays;

// Сортировка вставками. Дана последовательность чисел a1 ,a2 ,...,an. Требуется переставить числа в порядке
// возрастания. Делается это следующим образом. Пусть a1 ,a2 ,...,ai - упорядоченная последовательность, т. е.
// a1 <= a2 <= ... <= an. Берется следующее число ai+1 a и вставляется в последовательность так, чтобы новая
// последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
// не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
// с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class Task5 {

	public static void main(String[] args) {

		double[] array = { 4, 3, 2, 1 };
		System.out.println("Дан массив " + Arrays.toString(array));
		
		insertionSort(array);
	
		System.out.println("Получен массив " + Arrays.toString(array));
	}
	
	private static void insertionSort(double[] arr) {
		double temp;
		int posMax;

		for (int i = 1; i < arr.length; i++) {
			posMax = binaryMaxSearch(arr, arr[i], 0, i - 1);
			System.out.println(posMax);
			if (posMax != -1) {
				temp = arr[i];
				for (int j = i; j > posMax; j--) {
					arr[j] = arr[j - 1];
				}
				arr[posMax] = temp;
			}
		}
	}

	private static int binaryMaxSearch(double[] arr, double key, int left, int right) {

		int mid;
		int posMax;
		posMax = -1;

		do {
			mid = (left + right) / 2;
			if (arr[mid] > key) {
				right = mid - 1;
				posMax = mid;
			} else {
				left = mid + 1;
			}
		} while (left <= right);

		return posMax;
	}

}
