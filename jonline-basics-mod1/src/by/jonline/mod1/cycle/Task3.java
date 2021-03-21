package by.jonline.mod1.cycle;

//Найти сумму квадратов первых ста чисел

public class Task3 {

	public static void main(String[] args) {

		int b = 0;

		for (int i = 0; i <= 100; i++) {

			b = b + (int) Math.pow(i, 2);

		}

		System.out.println("Сумма квадратов первых ста чисел = " + b);

	}

}
