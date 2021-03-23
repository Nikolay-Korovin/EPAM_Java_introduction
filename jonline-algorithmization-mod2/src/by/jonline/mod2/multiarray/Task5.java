package by.jonline.mod2.multiarray;

import java.util.Arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
// 1   1   1 ... 1  1  1
// 2   2   2 ... 2  2  0
// 3   3   3 ... 3  0  0
// .   .   . ... .  .  .
// n-1 n-1 0 ... 0  0  0
// n   0   0 ... 0  0  0

public class Task5 {

	public static void main(String[] args) {

		int n = 6;
		int counterOne = 0;
		int counterTwo = n;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			counterOne+=1;
			for (int j = 0; j < counterTwo; j++) {
				array[i][j] = counterOne;
			}
			counterTwo--;

		}
		System.out.println(Arrays.deepToString(array));

	}

}
