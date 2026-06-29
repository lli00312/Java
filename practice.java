package 이윤서;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요.");
		char ch = sc.next().charAt(0);
		sc.close();
		if (ch != ' ' && ch != '\t')
			System.out.println("[1-1]2. ");

	}
}
