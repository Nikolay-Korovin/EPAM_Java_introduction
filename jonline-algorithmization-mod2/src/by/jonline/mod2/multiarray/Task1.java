package by.jonline.mod2.multiarray;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {

	public static void main(String[] args) {
		
		int twoDimArray[][] = { { 4, 2, 3, 1 },
								{ 4, 1, 2, 9 },
								{ 0, 8, 1, 7 },
								{ 5, 0, 2, 2 } };

		for (int i = 0; i < twoDimArray.length; i++) {
			for (int j = 0; j < twoDimArray[i].length; j = j + 2) {
	
				if (twoDimArray[0][j] > twoDimArray[(twoDimArray.length - 1)][j]) {
					System.out.print(twoDimArray[i][j] + " ");
				}
				
			}
			System.out.println("");
		}

	}
}
