package by.jonline.mod2.decomposition;

//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task15 {

	public static void main(String[] args) {

		int n = 2;

		sorntingEveryDigit(n);

	}

	public static void sorntingEveryDigit(int n) {

		int[] arr = howMuchDigits(n);

		for (int i = 0; i < arr.length; i++) {
			lookingForEncSeq(arr[i], n);
		}

	}

	public static void lookingForEncSeq(int n, int length) {
		int trueTemp = n;
		int temp = n;
		int[] arr = new int[length];
		boolean result = false;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp % 10;
			temp = temp / 10;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] <= arr[i]) {
				result = false;
			} else {
				result = true;
			}
		}
		if (result == true) {
			System.out.println(trueTemp);
		}

	}

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
