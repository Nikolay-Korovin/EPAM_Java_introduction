package by.jonline.mod2.decomposition;

//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.

public class Task13 {

	public static void main(String[] args) {

		int n = 2;
		System.out.println("На отрезке от " + n + " до " + n * 2 + " близнецами являются:");
		findTwins(n);

	}

	public static void findTwins(int n) {
		int[] arr = makeAList(n);
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 2] != 0) {
				System.out.printf("[%d][%d]\n", arr[i], arr[i + 2]);
			}
		}

	}

	public static int[] makeAList(int n) {

		int temp = n;
		int[] arr = new int[n + 3];

		for (int i = 0; i < arr.length - 2; i++) {
			arr[i] = temp;
			temp++;
		}
		return arr;
	}

}
