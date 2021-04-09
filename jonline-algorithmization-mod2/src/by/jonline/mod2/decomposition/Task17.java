package by.jonline.mod2.decomposition;

//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких

//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {

	public static void main(String[] args) {

		int n = 111;
		int count = 0;
		
		count = strangeMinus(n);
		System.out.println("количество итераций для получения нуля = " + count);

	}
	
	public static int strangeMinus(int n) {
		int count = 0;
		int temp = n;
		while(temp > 0) {
			temp = temp - sumOfDigits(temp);
			System.out.println(temp);//для наглядности 
			count++;
		}
		return count;
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		int temp = n;
		while (temp != 0) {
			sum = sum + temp % 10;
			temp = temp / 10;
		}

			return sum;
	}

}
