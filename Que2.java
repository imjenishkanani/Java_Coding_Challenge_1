//Question 3: write program to check weather the given number is even or odd using ternary operator?. 

import java.util.*;

public class Que2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		String res = number % 2 == 0 ? "EVEN" : "ODD";
		System.out.println(res);
		
	}
}
