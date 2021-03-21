package by.jonline.mod1.cycle;

//Даны числовой ряд T и некоторое число E. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. 

public class Task5 {

	public static void main(String[] args) {

		double sum = 0;
		float e = 0.1f;
		short t = 5;
		double[] mas = new double[t];

		System.out.println("заданное значение = " + e);
		
		System.out.println("ряд вида: ");

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i)); // Общий член ряда имеет вид

		}

		for (double a : mas) {
			System.out.println(a);
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}

		System.out.println("сумма членов ряда, чей модуль больше или равен заданному значению = " + sum);

	}

}
