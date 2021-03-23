package by.jonline.mod2.array;

import java.util.Arrays;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

public class Task9 {

	public static void main(String[] args) {

		int[] mas = { 1, 2, -3, -1, -3, -3, -1, 14, 0, 100, -1 };
		int[] masSameNumbersCounter = new int[mas.length];
		int[] resultMas = new int[mas.length];
		int maxNum = masSameNumbersCounter[0];
		int minNum = resultMas[0];

		// новый массив с количеством повторений по элементам (например, если 2 то таких
		// элементов в массиве 3)
		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i] == mas[j]) {
					masSameNumbersCounter[i] += 1;
				}
			}
		}

		// максимально часто встречающийся элемент
		for (int i = 1; i < masSameNumbersCounter.length; i++) {
			if (maxNum < masSameNumbersCounter[i]) {
				maxNum = masSameNumbersCounter[i];
			}
		}

		// создаём новый массив из самых частоповторяющихся чисел
		for (int i = 0; i < resultMas.length; i++) {
			if (maxNum == masSameNumbersCounter[i]) {
				resultMas[i] = mas[i];
			}
		}

		// если в результирующем массиве несколько результатов, то вычисляем минимальный
		// из них
		for (int e : resultMas) {
			if (minNum > e) {
				minNum = e;
			}
		}

		System.out.println("заданный массив  " + Arrays.toString(mas));
		System.out.println("самое часто встречающееся число(минимальное если повторялись) " + minNum);

	}
}