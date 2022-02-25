package week1.day2.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		int input=123;
		int sum=0;
		int remainder;
		while(input>0)
		{
			remainder=input%10;
			System.out.println("Remainder: "+remainder);
			sum=sum+remainder;
			System.out.println("Sum: "+sum);
			input=input/10;
			System.out.println("Quotient: "+input);
		}
		System.out.println("Sum of Digits is :"+sum);

	}

}
