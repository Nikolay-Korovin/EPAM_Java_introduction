package by.jonline.mod1.branching;

//. Найти max{min(a, b), min(c, d)}.

public class Task2 {

	public static void main(String[] args) {

		int a = 3;
		int b = 2;
		int c = 0;
		int d = -1;
		int res;

		res = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println(res);

	}

}
