package 이윤서;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		//[1-1]1.
		int x = 15;
		if(x>10&&x<20)System.out.println("[1-1]1. ");
		
		//[1-1]2.
		char ch='x';
		if (ch=='x') System.out.println("[1-1]2. ");
		
		
		//[1-1]3.
		Scanner sc= new Scanner(System.in);
		System.out.println("x 나 X 중 하나를 입력하세요.");
		char ch3=sc.next().charAt(0);
		if (ch3== 'x' || ch3== 'X') System.out.println("[1-1]3. ");
		
		//[1-1]4.
		System.out.println("0~9 중 숫자를 입력하세요.");
		ch= sc.next().charAt(0);
		if (ch >= '0' && ch <= '9') System.out.println("[1-1]4. ");
		
		//[1-1]5.
		System.out.println("영문자를 입력하세요. (대소문자 상관 없음)");
		char ch5= sc.next().charAt(0);
		if (ch5 >= 65 && ch<= 90) System.out.println("[1-1]5. ");
		else (ch5>= 97 && ch<=122) System.out.println("[1-1]5. ");
		
		//[1-1]6. ?
//		System.out.println("Year을 입력하세요.");
//		int year= sc.nextInt();
//		if (i=1 year*i== 400*i, i++) System.out.println("[1-1]6. ");
//		
//		
//		//[1-1]7. ?
//		System.out.println("powerOn을 입력하세요.");
//		String str= sc7.next().toString();
//		if (b)
//			
//		//[1-1]8. 
//		System.out.println("yes를 입력하세요.");
//		String str8= "yes"
//		if (str8=="yes") System.out.println("[1-1]8. ");
//		
//		//[1-2]
//		num= (int)93
//		System.out.println("[1-2]"+ num);
//		
//		//[1-3]
//		for (i=1; i<11 ;i++) {
			
		
	
			
		}
	}
	sc.close();
}
