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
		int length = ((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("Lengh of line is:" + Math.sqrt(length));
	}

}
