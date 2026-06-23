package 이윤서;

import java.util.Scanner;

public class p84_MultiplicationTable {
public static void main (String[] args) {
	
	int dan;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("원하는 단? ");
	dan =sc.nextInt();
	sc.close();
	
	int index=1;
	while(index <= 9) {
		System.out.println(dan + " * "+ index + " = "+ dan*index);
		index++;
	}
}


}
