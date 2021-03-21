package by.jonline.mod1.branching;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task3 {

	public static void main(String[] args) {

		int x1 = 4;
		int y1 = 4;
		int x2 = 2;
		int y2 = 2;
		int x3 = 0;
		int y3 = 0;
		int S;
		
		//ищем через площадь треугольника(чтобы избежать деления на ноль, при одинаковых х или у)
		S = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2; 
		
		if (S == 0) {										     
			System.out.println("точки на одной линии");
		} else
			System.out.println("точки Не на одной линии");
	}

}

