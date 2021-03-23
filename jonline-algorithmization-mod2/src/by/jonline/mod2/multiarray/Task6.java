package by.jonline.mod2.multiarray;

import java.util.Arrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//1   1   1 ... 1   1   1
//0   1   1 ... 1   1   0
//0   0   1 ... 1   0   0
//.   .   . ... .   .   .
//0   1   1 ... 1   1   0
//1   1   1 ... 1   1   1

public class Task6 {

	public static void main(String[] args) {
		int n = 8;
		int counter = 0;
		int counterI = 0;
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			if (counter < n / 2) {
				for (int j = 0 + counter; j < n - counter; j++) {
					array[i][j] = 1;
				}
				counter += 1;
				counterI++;
			}
		}

		for (int i = counterI; i < n; i++) {
			counter -= 1;
			for (int j = 0 + counter; j < n - counter; j++) {
				array[i][j] = 1;
			}

		}
		
		System.out.println(Arrays.deepToString(array));
		
	}

}
