package by.jonline.mod2.multiarray;

//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,n^2
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат
//описание метода построения взял с сайта http://www.klassikpoez.narod.ru/latsov.htm
//работает для массивов порядка n=4k, k = 1,2,3...

public class Task16 {

	public static void main(String[] args) {

		int n = 4;
		int[][] array1 = new int[n][n];
		int[][] array2;
		int[][] array3;

		firstStep(array1);

		array2 = secondStep(array1);

		array3 = thirdStep(array1, array2);
		
		arrViev(array3);

	}

	// 1 этап. Строим обобщённый латинский квадрат порядка n следующим образом:
	// каждая строка нижней половины
	// квадрата заполняется путём последовательного чередования чисел i и n-i-1, где
	// i – порядковый
	// номер строки (строки нумеруются снизу вверх целыми числами от 0 до n-1);
	// верхняя половина квадрата получается из нижней отражением относительно
	// вертикальной оси симметрии.
	public static int[][] firstStep(int[][] array) {
		int n = array.length;
		for (int i = n - 1; i >= n / 2; i--) {
			for (int j = 0; j < n; j++) {
				if (j % 2 == 0) {
					array[i][j] = n - i - 1;
					array[i - (n / 2)][j] = i;
				} else {
					array[i - (n / 2)][j] = n - i - 1;
					array[i][j] = i;
				}
			}

		}
		return array;
	}

	// 2 этап. Строим второй обобщённый латинский квадрат из первого. Для этого надо
	// повернуть построенный на первом этапе квадрат на 90 градусов по часовой
	// стрелке.
	public static int[][] secondStep(int[][] array) {

		int[][] retArr = new int[array[0].length][array.length];
		int retArrI = 0;
		int retArrJ = array.length - 1;
		for (int[] srI : array) {
			for (int srJ : srI) {
				retArr[retArrI++][retArrJ] = srJ;
			}
			retArrI = 0;
			retArrJ--;
		}
		return retArr;
	}

	// 3 этап. Строим совершенный квадрат следующим образом.
	// Обозначим элементы первого латинского квадрата aij, элементы второго
	// латинского квадрата – bij,
	// тогда каждый соответствующий элемент совершенного квадрата cij получается по
	// формуле:
	// cij = n*aij + bij + 1
	public static int[][] thirdStep(int[][] arrayA, int[][] arrayB) {

		int seed = (int) (1 + Math.random() * 10);
		System.out.println("seed = " + seed);

		int[][] array = new int[arrayA.length][arrayA.length];
		int n = array.length;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = seed *( n * arrayA[i][j] + arrayB[i][j] + 1);
			}
		}
		return array;

	}

	public static void arrViev(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println("");
		}

		System.out.println("");

	}
}
