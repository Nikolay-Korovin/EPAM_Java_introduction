package by.jonline.mod2.multiarray;
//НЕДОДЕЛАНО
//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,n^2
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:

public class Task16 

	public static void main(String[] args) {
		 
		int n = 5;  //нечётный порядок
		int allNum = n*n;
		int startNum = 0;
		int M = (n * (n*n + 1))/2;	//магическая константа сумма чисел диагоналей, строк, столбцов
		int m = (n*n + 1)/2;		//магическое число по центру 
		//System.out.println(M);
		//System.out.println(m);
		
		int[][] array = new int[n][n]; 
		int[][] arrayNumbers = new int[n][n]; 
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arrayNumbers[i][j] = startNum;
				startNum++;
				System.out.printf("%3d",startNum);
			}
			System.out.println();
		}
		

	}

}
