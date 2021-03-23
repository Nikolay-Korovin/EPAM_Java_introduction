package by.jonline.mod2.array;

//Даны действительные числа a(1), a(2), ..., a(2n) . Найти max(a(1)+a(2n), a(2)+a(2n-1), ...,a(n)+a(n+1)).
//тут была ошибка в условии, я не особо понял что надо делать (одна задача из 10)

public class Task7 {

	public static void main(String[] args) {

		double[] mas = { 0, 1.1, 0.2, -14.3, 0.01, 4, 0 };
		int n = mas.length - 1;
		double sum = mas[0] + mas[n];
		double max = sum;
		for (int i = 1; i < n / 2 + 1; i++) {
			sum = mas[i] + mas[n - i];
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println(max);

	}

}
