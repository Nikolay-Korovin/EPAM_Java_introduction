package by.jonline.mod2.multiarray;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

public class Task14 {

	public static void main(String[] args) {

		// количество столбцов не должно быть больше чем количество строк
		int m = 20;// строки
		int n = 19;// столбцы
		int oneCounter = 0;

		int[][] array = new int[m][n];

		for (int j = 0; j < n; j++) {
			oneCounter = j + 1;
			do
				for (int i = 0; i < m; i++) {
					int something = (int) (Math.random() * array.length);
					if (array[something][j] != 1 & oneCounter != 0) {
						array[something][j] = 1;
						oneCounter--;
					}
				}
			while (oneCounter != 0);
		}

		printArray(array);

	}

	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
