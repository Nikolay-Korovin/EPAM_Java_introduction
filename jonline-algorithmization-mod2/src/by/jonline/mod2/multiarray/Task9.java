package by.jonline.mod2.multiarray;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task9 {

	public static void main(String[] args) {

		int maxSum = 0;
		int maxMasEle = 0;
		int columnCount = 0;
		int array[][] = { { 100, 2, 3, 1 }, { 10, 10, 1, 9 }, { 10, 8, 11, 10 }, { 1, 0, 300, 200 } };
		int countingArray[] = new int[array[0].length];

		for (int j = 0; j < array.length; j++) {
			int sum = 0;
			for (int i = 0; i < array[j].length; i++) {
				sum += array[i][j];
			}
			if (sum > maxSum) {
				maxSum = sum;
			}
			countingArray[j] = sum;
			columnCount++;
			System.out.println("сумма в столбце номер " + columnCount + " = " + sum);
		}
		
		for (int i = 0; i < countingArray.length; i++) {
			if(maxSum == countingArray[i]) {
				maxMasEle = i+1;
			}
		}
		
		System.out.println("максимальная сумма " + maxSum + " в столбце номер " + maxMasEle);
	}
}
