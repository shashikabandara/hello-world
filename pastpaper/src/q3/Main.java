package q3;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class Main {

	public static void main(String args[]) {
		String lock=" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Textile Pattern 1 =");
		String tp1 = sc.next();
		System.out.println("Enter Textile Pattern 2 =");
		String tp2 = sc.next();
		System.out.println("Enter Pattern Width =");
		int pw = sc.nextInt();
		System.out.println("Enter count =");
		int c = sc.nextInt();
		
		PatternThread01 pt1 = new PatternThread01(lock,tp1,pw,c);
		PatternThread02 pt2 = new PatternThread02(lock,tp2,pw,c);
		pt1.start();
		pt2.start();
		
		
	}
}
