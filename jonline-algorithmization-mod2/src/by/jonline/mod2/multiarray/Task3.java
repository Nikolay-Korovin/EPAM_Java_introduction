package by.jonline.mod2.multiarray;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {

	public static void main(String[] args) {
		
		int twoDimArray[][] = { { 4, 2, 3, 1 },
								{ 4, 1, 2, 9 },
								{ 0, 8, 1, 7 },
								{ 1, 0, 3, 2 } };
		
		int k = 4;
		int p = 4;
		
		System.out.println("заданная строка " + k);
		for(int i = k-1, j = 0; j < twoDimArray[k-1].length; j++) {
			System.out.print(twoDimArray[i][j] + " ");
		}
		
		System.out.println("\n" + "заданный столбец " + p);
		for(int i = 0, j = p-1; i < twoDimArray[p-1].length; i++) {
			System.out.println(twoDimArray[i][j] + " ");
		}

	}

}
