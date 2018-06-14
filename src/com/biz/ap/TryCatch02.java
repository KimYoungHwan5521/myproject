package com.biz.ap;

import java.util.Scanner;

public class TryCatch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int intSum =0;

		System.out.println("종료: ~END");
		while(true) {
			
			System.out.print("숫자>>");
			String str = scanner.nextLine();
			if(str.equals("~END")) break;
			
			try {
				int intNum=Integer.valueOf(str);
				intSum+=intNum;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자 입력 오류");
			}
			
		}
		
		System.out.println("합계: "+intSum);
		

	}

}
