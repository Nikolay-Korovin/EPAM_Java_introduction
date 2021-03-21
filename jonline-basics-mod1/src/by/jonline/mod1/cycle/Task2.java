package by.jonline.mod1.cycle;

//Вычислить значения функции Y на отрезке [A,B] c шагом h:

public class Task2 {

	public static void main(String[] args) {

		double a = -10;
		double b = 20;
		double h = 4;
		double y;
		
		System.out.println("x  |  f(x)");
		
		while (a <= b) {
			if(a > 2) {
				y = a;
				System.out.println(a + " | " + y);
			}else {
				y = -a;
				System.out.println(a + " | " + y);
			}
			a = a + h;
		}

	}

}
