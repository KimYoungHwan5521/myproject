package com.biz.ap;

public class TryCatch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1 ="30";
		String num2 ="40";
		
		System.out.println(num1+num2); // 3040이 출력
		
		int intNum1 = Integer.valueOf(num1);
		int intNum2 = Integer.valueOf(num2);
		
		System.out.println(intNum1 + intNum2); // 70이 출력
		
		num1 = "30 ";
		num2 = " 40";
		
		// try는 본체내부의 코드를 실행하는 과정에서 exception이 발생하면
		// exception 정보를 catch에 전달하고 catch() 메서드를 실행
		try {
			intNum1= Integer.valueOf(num1);
			intNum2= Integer.valueOf(num2);	
		} catch (Exception e) {
			// e 변수에 현재 발생된 exception 정보를 담아온다
			// e 변수의 내용을 확인하면 어떤 exception이 발생했는지를 알 수 있다.
			// e.printStackTrace(); // java에서 기본적으로 보여주는 exception 메시지. 이 메시지를 사용하지 않고 우리만의 메시지를 전달한다.
			System.out.println(e.getMessage());
			
		}
		

	}

}
