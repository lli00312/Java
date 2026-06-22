package 이윤서;

import java.util.Scanner;

public class p65_if {
	public static void main(String[] args) {
		int score;
		score = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("학점을 입력하세요. >> ");
		score = sc.nextInt();
		sc.close();
		
		if (score >= 90) System.out.println("A학점 입니다.");
		else if (score <90 && score >=80) System.out.println("B학점 입니다.");
		else if (score <80 && score >=70) System.out.println("B학점 입니다.");
		else if (score <70 && score >=60) System.out.println("B학점 입니다.");
		else System.out.println("F학점 입니다.");
			
		

	}

}
