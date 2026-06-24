package 이윤서;

import java.util.Scanner;

public class p107_Calculator {
	public static void main(String[] args) {

		double result;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("연산 ( a : 덧셈 , s : 뺄셈 , m : 곱셈 , d : 나눗셈 , q : 종료 )을 선택하세요.");
			char c = sc.next().charAt(0);

			if (c == 'q') {
				System.out.println("프로그램을 종료하였습니다.");
				break;
			} else if (!(c == 'a' || c == 's' || c == 'm' || c == 'd')) {
				System.out.println("유효하지 않은 메뉴입니다.");
				continue;
			}
			System.out.println("첫 번째 숫자 ( 음수도 가능 )>> ");
			int a = sc.nextInt();
			System.out.println("두 번째 숫자 ( 음수도 가능 )>> ");
			int b = sc.nextInt();

			if (c == 'a')
				result = a + b;

			else if (c == 's')
				result = a - b;
			else if (c == 'm')
				result = a * b;
			else
				result = a / b;

			System.out.println("결과는 " + result + "입니다.");
		} while (true);
		sc.close();
	}
}
