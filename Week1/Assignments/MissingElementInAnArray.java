package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i = arr[0]; i < arr.length; i++) {
			if(i!=arr[i-1])
			{
				System.out.println("Value of i is: "+i);
				System.out.println("Value of arr[i-1] is: "+arr[i-1]);
				System.out.println("Missing number is: "+i);
				break;
			}
		}
		
		
	}

}
