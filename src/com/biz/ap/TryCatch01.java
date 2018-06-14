package com.biz.ap;

public class TryCatch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1 ="30";
		String num2 ="40";
		
		System.out.println(num1+num2); // 3040�� ���
		
		int intNum1 = Integer.valueOf(num1);
		int intNum2 = Integer.valueOf(num2);
		
		System.out.println(intNum1 + intNum2); // 70�� ���
		
		num1 = "30 ";
		num2 = " 40";
		
		// try�� ��ü������ �ڵ带 �����ϴ� �������� exception�� �߻��ϸ�
		// exception ������ catch�� �����ϰ� catch() �޼��带 ����
		try {
			intNum1= Integer.valueOf(num1);
			intNum2= Integer.valueOf(num2);	
		} catch (Exception e) {
			// e ������ ���� �߻��� exception ������ ��ƿ´�
			// e ������ ������ Ȯ���ϸ� � exception�� �߻��ߴ����� �� �� �ִ�.
			// e.printStackTrace(); // java���� �⺻������ �����ִ� exception �޽���. �� �޽����� ������� �ʰ� �츮���� �޽����� �����Ѵ�.
			System.out.println(e.getMessage());
			
		}
		

	}

}