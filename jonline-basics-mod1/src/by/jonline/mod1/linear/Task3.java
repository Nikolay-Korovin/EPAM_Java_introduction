package by.jonline.mod1.linear;

public class Task3 {

	public static void main(String[] args) {
		
		double x=2;
		double y=4;
		double res;
		
		res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
		
		System.out.println(res);

	}

}
