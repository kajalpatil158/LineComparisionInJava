package linecompare;

import java.util.Scanner;

public class LineCompare {

	public static void main(String[] args) {
		// Message
		System.out.println("Well Come To Line Comparision Computation Program");
		// Computation
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 ");
		int x1 = sc.nextInt();
		System.out.print("Enter x2 ");
		int x2 = sc.nextInt();
		System.out.print("Enter y1 ");
		int y1 = sc.nextInt();
		System.out.print("Enter y2 ");
		int y2 = sc.nextInt();
		System.out.print("Enter A1 ");
		int A1 = sc.nextInt();
		System.out.print("Enter A2 ");
		int A2 = sc.nextInt();
		System.out.print("Enter B1 ");
		int B1 = sc.nextInt();
		System.out.print("Enter B2 ");
		int B2 = sc.nextInt();
		int length = ((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		int length2 = ((A2 - A1) ^ 2 + (B2 - B1) ^ 2);
		//Comapare Two Lines Here Whether That Are Gretter Smaller Or Equal
		if (length == length2) {
			System.out.println("Both are equal");
		} else if (length >= length2) {
			System.out.println("Line1 is gretter than line 2");
		} else if (length <= length2) {
			System.out.println("Line1 is smaller than line 2");
		}
	}
}
