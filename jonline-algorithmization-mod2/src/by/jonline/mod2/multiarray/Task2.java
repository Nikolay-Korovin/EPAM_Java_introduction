package by.jonline.mod2.multiarray;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {

	public static void main(String[] args) {
		
		int twoDimArray[][] = { { 4, 2, 3, 1 },
								{ 4, 1, 2, 9 },
								{ 0, 8, 1, 7 },
								{ 1, 0, 3, 2 } };
		
		for( int i = 0, j = 0; i < twoDimArray.length;i++ ,j++ ) {
			System.out.print(twoDimArray[i][j]);
		}
		
		System.out.println("");
		
		for( int i = 0, j = twoDimArray.length-1; j >= 0; i++ ,j-- ) {
			System.out.print(twoDimArray[i][j]);
		}

	}

}
