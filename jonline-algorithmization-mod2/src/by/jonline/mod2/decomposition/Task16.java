package by.jonline.mod2.decomposition;

//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task16 {

	public static void main(String[] args) {

		int N = 4;
		int oddSumN;
		int numberOfEvenInOddSum;
		oddSumN = findOddSum(N);
		numberOfEvenInOddSum = numberOfEven(oddSumN);
		System.out.println("сумма всех нечётных " + N + " значных чисел = " + oddSumN);
		System.out.println("количество чётных цифр " + "в этой сумме = " + numberOfEvenInOddSum);
	}

	public static int numberOfEven(int n) {
		int num = 0;
		int temp = n;

		while (temp != 0) {
			if (((temp % 10) % 2) == 0) {
				num++;
			}
			temp = temp / 10;
		}

		return num;
	}

	public static int findOddSum(int n) {
		int sum = 0;
		int[] arr = howMuchDigits(n);

		for (int i = 0; i < arr.length; i++) {
			if (isCompleteOdd(arr[i]) == true) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	public static boolean isCompleteOdd(int n) {
		int[] arr;
		boolean isOdd = false;
		int masLength = 0;
		int tempMas = n;
		int tempMas2 = n;
		int counter = 0;

		while (tempMas != 0) {
			tempMas = tempMas / 10;
			masLength++;
		}

		arr = new int[masLength];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = tempMas2 % 10;
			tempMas2 = tempMas2 / 10;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				counter++;
			}
		}

		if (counter == masLength) {
			isOdd = true;
		}
		return isOdd;
	}

	// мой метод из задачи 15
	public static int[] howMuchDigits(int n) {
		int num1 = 1;
		int num2 = 1;
		int[] arr;

		for (int i = 0; i < n; i++) {
			num1 = num1 * 10;
		}

		for (int i = 0; i < n - 1; i++) {
			num2 = num2 * 10;
		}

		arr = new int[num1 - num2];

		for (int i = 0, j = num2; j < num1; i++, j++) {
			arr[i] = j;
		}

		return arr;

	}

}
