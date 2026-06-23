package 이윤서;

import java.util.Random;
import java.util.Scanner;

public class p94_NumberGuessing {
	public static void main (String[] args) {
		
		int answer= (new Random()).nextInt(100) +1;
		int guess;
		
		Scanner sc= new Scanner(System.in);
		boolean cont = true;
		char programCont;
		
		do {
			cont=true;
			System.out.println("게임을 시작합니다.");
	
		while(cont) {
			System.out.println("예측 값? ");
			guess = sc.nextInt();
			
			if (guess > answer) System.out.println("정답보다 큽니다.");
			else if (guess< answer) System.out.println("정답보다 작습니다.");
			else {
				System.out.println("정답입니다!!!");
				cont = false;
						
			}
		}
		System.out.println("계속하시겠습니까? ('y' or 'n')");
		programCont= sc.next().charAt(0);
	} while (programCont== 'y');
		System.out.println("게임을 종료합니다.");
		sc.close();
	}
}
