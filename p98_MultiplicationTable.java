package 이윤서;

import java.util.Scanner;

public class p98_MultiplicationTable {

	public static void main(String[] args) {

		int dan;

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단? ");
		dan = sc.nextInt();
		sc.close();

		for (int index = 1; index <= 9; index++) {
			System.out.println(dan + " * " + index + " = " + dan * index);
		}
	}
}