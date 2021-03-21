package by.jonline.mod1.linear;

//ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). ѕомен€ть местами
//дробную и целую части числа и вывести полученное значение числа.


public class Task4 {

	public static void main(String[] args) {

		double a = 333.444;
		
		double b;
		
		b = (a * 1000) % 1000 + (int) a / 1000.0;
		
		System.out.println(b);

	}

}
