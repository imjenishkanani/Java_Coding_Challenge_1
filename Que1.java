import java.util.*;

public class Que1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		
		if(marks < 60)
			System.out.println("Fail");
		else if(marks >= 60 && marks < 90)
			System.out.println("Pass");
		else
			System.out.println("Passed with Distinction");
	}
}
