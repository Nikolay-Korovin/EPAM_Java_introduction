package by.jonline.mod4.prog_with_classes.task1;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.

public class Test1 {

	private int x;
	private int y;
	
	public Test1() {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void printNums() {
		System.out.println("x = " + x + " y = " + y);
	}

	public int sumOfNums() {
		return x + y;
	}

	public int maxOfNums() {
		if (x > y) {
			return x;
		} else
			return y;
	}

}
