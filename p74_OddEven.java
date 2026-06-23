package 이윤서;

import java.util.Scanner;

import java.util.Scanner;
import java.util.Random;

public class p74_OddEven {
	public static void main ( String[] args) {
		
		Random rnd= new Random();
		int quest = rnd.nextInt(100);
		char answer = (quest%2) ==0 ? 'e' :'o';
		
		Scanner sc= new Scanner ( System.in);
		System.out.println("짝수라 생각하면 e를 홀수라 생가갛면 o를 입력 >> ");
		char guess = sc.next().charAt(0);
		sc.close();
		
		if (guess == answer) {
			System.out.println("축하합니다!!!");
		}
		else {
			System.out.println("땡");
	
		}
	}


}
