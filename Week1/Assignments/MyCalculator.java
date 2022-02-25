package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int addResult=calc.add(10, 20, 30);
		System.out.println("Addition of three numbers is: "+addResult);
		int subResult=calc.sub(200, 45);
		System.out.println("Subtraction of two numbers is: "+subResult);
		double mulResult=calc.mul(213, 5);
		System.out.println("Multiplication of two numbers is: "+mulResult);
		float divResult=calc.divide(360F, 3F);
		System.out.println("Division of two numbers is: "+divResult);

	}

}
