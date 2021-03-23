package by.jonline.mod2.array;

import java.util.Arrays;

//Дана последовательность целых чисел a1 ,a2, a3, ..., an
//образовать новую последовательность, выбросив из исходной
//те члены, которые равны min(a1, a2, ..., an).

public class Task8 {

	public static void main(String[] args) {

		int[] mas = { 1, 2, 3, 10, -1, -1, -3, 14, 0, 100, -3 };
		int minNum = mas[0];
		int[] mas2;
		int counter = 0; // для количества повторений min
		int count = 0; // для перебора второго массива

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < minNum) {
				minNum = mas[i];
			}
		}

		for (int e : mas) {
			if (e == minNum) {
				counter++;
			}
		}

		mas2 = new int[mas.length - counter];

		for (int e : mas) {
			if (e != minNum) {
				mas2[count] = e;
				count++;
			}

		}
		System.out.println(Arrays.toString(mas));
		System.out.println(Arrays.toString(mas2));

	}

}
