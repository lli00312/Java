package 이윤서;

import java.util.Scanner;

public class test_ {
	public static void main(String[] args) {
		
		  //[1-1]1. int x = 15; if(x>10&&x<20)System.out.println("[1-1]1. ");
		  
		  //[1-1]2. Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요.");
		char ch = sc.next().charAt(0);
		sc.close();
		if (ch != ' ' && ch != '\t')
			System.out.println("[1-1]2. ");
		  
		  
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
		  if result = ('A' <= ch1 && ch1 <= 'Z') || ('a' <= ch1 && ch1 <= 'z');
		  System.out.println(result);
		  
		  //[1-1]6.
		  System.out.println("Year을 입력하세요.");
		  int year = sc.nextInt();
		  if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		  System.out.println("[1-1]6.");
		  
		  
		  //[1-1]7. 
		  boolean powerOn = false; if (!powerOn)
		  System.out.println("[1-1]7.");
		 

		// [1-1]8.
//		String str= "yes"
//		System.out.println(str.equals("yes"));
//	
		// [1-2]
//		int sum = 0;
//	for (int i = 1; i <= 20; i++) {
//	    if (i % 2 != 0 && i % 3 != 0) {
//        sum += i;
//	    }
//	}
//		System.out.println(sum);
//
// 
//		//[1-3]
//		int sum=0;
//		int ans=0;
//		for (int i=1; i<=10; i++) {
//    	sum=sum+i
//		}

//		System.out.print(1+" ");
//		System.out.println();
//		System.out.print(1+" ");
//		System.out.print(2+" ");
//		System.out.println();
//		System.out.print(1+" ");
//		System.out.print(2+" ");
//		System.out.print(3+" ");
//		System.out.println();
//		
//		int num;
//		num = 1;
//		for(int x=1;x<=1;x++) {
//			System.out.print(num+" ");num++;
//		}
//		System.out.println();
//		
//		num=1;
//		for(int x=1;x<=2;x++) {
//			System.out.print(num+" ");num++;
//		}
//		System.out.println();
//		
//
//		num=1;
//		for(int x=1;x<=3;x++) {
//			System.out.print(num+" ");num++;
//		}
//		System.out.println();

//		int num;
//		for(int y=1;y<=3;y++) {
//			num = 1;
//			for(int x=1;x<=y;x++) {
//				System.out.print(num+" ");num++;
//			}
//			System.out.println();
//		}
//		
//		for(int y=1;y<=10;y++) {
//			for(int x=1;x<=y;x++) {
//				System.out.print(x+" ");
//			}
//			System.out.println();
//		}
		/*
		 * System.out.println("1");
		 * 
		 * System.out.print(1+" "); System.out.println("2");
		 * 
		 * System.out.print("1"); System.out.print(" "); System.out.print("2");
		 * System.out.print(" "); System.out.print("3");
		 */

		/*
		 * int num; num=1; int y = 1; for (int x=1; x<=y; x++){
		 * System.out.print(num+" "); num++; } System.out.println();
		 */

//		int num;
//		int y;
//		for (y = 1; y <= 10; y++) {
//			num = 1;
//			for (int x = 1; x <= y; x++) {
//				System.out.print(num + " ");
//				num++;
//			}
//			System.out.println();
//		}

		int num;
		int y;
		int ans = 0;
		for (y = 1; y <= 10; y++) {
			num = 1;
			for (int x = 1; x <= y; x++) {
				ans += num;
				num++;
			}
		}
		System.out.println(ans);
//		
//		int num=0;
//		int ans = 0;
//		for (int y = 1; y <= 10; y++) {
//			num += y;
//			ans += num;
//		}
//		System.out.println(ans);

		/*
		 * num=1; int y2=1; for (int x=1; x<=y2; x++){ System.out.print(num+" "); num++;
		 * }
		 */

		/*
		 * System.out.print(num+" "); System.out.println(num+1+" ");
		 * 
		 * System.out.print(num+" "); System.out.print(num+1+" ");
		 * System.out.print(num+2+" ");
		 */

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

		// [1-7]
//    String str= "41389";
//    int sum=0;
//    for ( int i=0; i <str.length(); i++) {
		//
//	}
//	System.out.println("sum="+sum);

	}
}
