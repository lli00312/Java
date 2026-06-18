package 이윤서;

import java.util.Scanner;

public class p33_SayHello {
	public static void main(String[]args) {
		System.out.println("이름 입력 >> ");
		Scanner sc=new Scanner (System.in);
		String name=sc.next();
		sc.close();
		
		String hellowMessage ="안녕하세요."+name+"님, 자바 세계에 오신 것을 환영합니다.";
		System.out.println(hellowMessage);
		}

}
