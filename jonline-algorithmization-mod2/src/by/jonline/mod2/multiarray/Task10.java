package by.jonline.mod2.multiarray;

//10. Найти положительные элементы главной диагонали квадратной матрицы

public class Task10 {

	public static void main(String[] args) {

		int array[][] = { { -2, 2, 3, 1 }, { 4, 1, 2, 9 }, { 0, 8, 1, 7 }, { 1, 0, 3, 0 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();

		}

		System.out.print("Положительные элементы главной диагонали квадратной матрицы : ");

		for (int i = 0; i < array.length; i++) {
			if (array[i][i] > 0) {
				System.out.print(array[i][i] + " ");
			}
		}

	}

}
