package by.jonline.mod2.array;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task5 {

	public static void main(String[] args) {

		int[] mas = { 1, 2, 8, 10, -5, 14, 6, 5, 9 };

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i] + " ");
			}
		}

	}

}
