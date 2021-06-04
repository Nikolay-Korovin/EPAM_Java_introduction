package by.jonline.mod2.decomposition;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

public class Task9 {

	public static void main(String[] args) {

		double x;
		double y;
		double z;
		double t;

		x = 4;
		y = 4;
		z = 5;
		t = 1;

		System.out.println(areaRectangle(x, y, z, t));

	}

	public static double areaRectangle(double x, double y, double z, double t) {
		double diagonal = 0;
		double area = 0;

		diagonal = findDiagonal(x, y);

		area = triangleArea(x, y, diagonal) + triangleArea(z, t, diagonal);

		return area;
	}

	public static double findDiagonal(double x, double y) {
		double diagonal = 0;
		diagonal = Math.sqrt(x * x + y * y);
		return diagonal;
	}

	public static double triangleArea(double a, double b, double diagonal) {

		double halfPerimeter;
		double TriangleArea;

		halfPerimeter = (diagonal + a + b) / 2;
		TriangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - diagonal));
		return TriangleArea;
	}

}
