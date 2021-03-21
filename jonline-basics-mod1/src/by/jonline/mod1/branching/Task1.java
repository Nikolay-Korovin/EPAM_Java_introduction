package by.jonline.mod1.branching;

import java.io.IOException;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class Task1 {

	public static void main(String[] args) throws IOException {

		int x = 90;
		int y = 60;

		if (x == 90 ^ y == 90 ^ (x + y) == 90) {
			System.out.println("Треугольник существует и он прямоугольный");
		} else if ((x + y) < 180) {
			System.out.println("Треугольник существует");
		} else
			System.out.println("Треугольника не существует");

	}

}
