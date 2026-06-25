package 이윤서;

import java.util.Scanner;

public class p111_ConditionOperation0625 {
	public static void main(String[] args) {
		System.out.println("n의 값을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String result = "";
		int i, p;
		for (p = 2; p < n; p++) {
			for (i = 2; i < p; i++) {
				if ((p % i) == 0)
					break;
			}
			if (i == p)
				result = result + " " + p;
		}
		System.out.println(n + "보다 작은 소수 >>" + result);
		sc.close();
	}
}
