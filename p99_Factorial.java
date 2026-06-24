package 이윤서;

import java.util.Scanner;

public class p99_Factorial {
	public static void main (String[]args) {
		System.out.println("n의 값을 입력하시오. ");
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int i, factorial;
		for (i=1, factorial=1; i <= n; i++)
		{
			factorial = factorial *i;
		}
		System.out.println("1~ "+n+"까지의 곱은" +factorial +"입니다.");
	}

}
