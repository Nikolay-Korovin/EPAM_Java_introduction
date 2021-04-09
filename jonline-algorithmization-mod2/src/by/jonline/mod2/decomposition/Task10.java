package by.jonline.mod2.decomposition;

import java.util.Arrays;

//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.

public class Task10 {

	public static void main(String[] args) {

		int n;
		n = 4206969;
		System.out.println(Arrays.toString(split(n)));

	}

	public static int[] split(int n) {
		int[] arr;
		int counter = 0;
		int masPrep = n;

		while (n != 0) {
			n = n / 10;
			counter++;
		}

		arr = new int[counter];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = masPrep % 10;
			masPrep = masPrep / 10;
		}

		return arr;
	}

}
