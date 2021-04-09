package by.jonline.mod2.decomposition;

//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

public class Task1 {

	public static void main(String[] args) {

		int a;
		int b;

		a = 75;
		b = 60;
		
		System.out.println("НОД для чисел " + a + " и " + b + " = " + nod(a, b));
		System.out.println("НОК для чисел " + a + " и " + b + " = " + nok(a, b));

	}

	public static int nok(int a, int b) {	
		
		int result;
		
		result = (a * b) / nod(a, b);
		
		return result;	
		
	}

	public static int nod(int a, int b) {
		
		while (a != 0 && b != 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}
		
		return a + b;
	}

}
