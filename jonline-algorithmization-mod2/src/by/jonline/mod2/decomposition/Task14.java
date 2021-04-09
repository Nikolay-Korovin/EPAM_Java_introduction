package by.jonline.mod2.decomposition;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

public class Task14 {

	public static void main(String[] args) {

		long n = 1000;

		findArmstrongNum(n);

	}

	public static void findArmstrongNum(long n) {

		for (long i = 0; i <= n; i++) {
			long temp = armstrongNum(i);
			if (temp != 0) {
				System.out.println(temp);
			}

		}

	}

	public static long armstrongNum(long n) {
		long num = n;
		long rem, temp, res = 0;
		long result = 0;

		temp = num;
		res = 0;

		while (temp != 0) {
			rem = temp % 10;
			temp = temp / 10;
			res = res + (rem * rem * rem ); 
		}

		if (num == res) {
			result = num;
		}
		return result;

	}

}
