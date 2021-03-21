package by.jonline.mod1.linear;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае: 

public class Task6 {

	public static void main(String[] args) {

		double x = 0;
		double y = -1;

		if ((x >= 0 & x <= 2) & (y >= 0 & y <= 4)) 
			System.out.println("true");
		else if ((x >= 0 & x <= 4) & (y <= 0 & y >= -3)) 
			System.out.println("true");
		else if ((x <= 0 & x >= -4) & (y <= 0 & y >= -3)) 
			System.out.println("true");
		else if ((x <= 0 & x >= -4) & (y >= 0 & y <= 4)) 
			System.out.println("true");
		else
			System.out.println("false");

	}

}
