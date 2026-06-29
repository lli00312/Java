package 이윤서;

import java.util.Scanner;

public class test_ {
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
	    char ch1= sc.next().charAt(0);
	    boolean result = ('A' <= ch1 && ch1 <= 'Z') || ('a' <= ch1 && ch1 <= 'z');
	    System.out.println(result);
		
		//[1-1]6.
	    System.out.println("Year을 입력하세요.");
    	int year = sc.nextInt();
    	if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) System.out.println("[1-1]6."); 
	
	
    	//[1-1]7. 
    	boolean powerOn = false;
    	if (!powerOn) System.out.println("[1-1]7.");
		
		//[1-1]8. 
//		System.out.println("yes를 입력하세요.");
//		String str8= "yes"
//				if (str8=="yes") System.out.println("[1-1]8. ");
//	
//		//[1-2]
//		int sum = 0;
//		for (int i = 1; i <= 20; i++) {
//	    if (i % 2 != 0 && i % 3 != 0) {
//	        sum += i;
//	    }
//	}
//		System.out.println(sum);
//
// 
//		//[1-3]
//   
//		//[1-6]
//		int y = 0;
//		while (y < 10) {
//			int x = 0;
//        while (x <= y) {
//            System.out.print("*");
//            x++;
//        }
//        System.out.println();
//        y++;
//    }
    
			//[1-7]
//    String str= "41389";
//    int sum=0;
//    for ( int i=0; i <str.length(); i++) {

	    }
}
