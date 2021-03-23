package by.jonline.mod2.multiarray;

import java.util.Arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

// 1  2   3   ... n
// n  n-1 n-2 ... 1
// 1  2   3   ... n
// .  .   .   ... .
// n  n-1 n-2 ... 1

public class Task4 {

	public static void main(String[] args) {

		int n = 6;
		int[][] mDArray = new int[n][n];

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				int num = 0;
				for (int j = 0; j <= n - 1; j++) {
					mDArray[i][j] = num += 1;
				}
			} else {
				int num2 = n;
				for (int j = 0; j <= n - 1; j++) {
					mDArray[i][j] = num2 - j;
				}
			}
		}

		System.out.println(Arrays.deepToString(mDArray));

	}

}
