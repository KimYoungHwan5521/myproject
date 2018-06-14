package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter�� ���� ������ �����ϰ� ���� ����ϴ� Ŭ����
 * �� Ŭ������ �̿��ؼ� ������ ���� ����� ����
 * 
 * 
 */

public class FileWriter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/biz/ap/data1.txt";
		
		// ������ ����
		FileWriter fileWriter = null;
		
		// ������ ������ ��� �� �� FileWriter�� �߰��� ���������� �� buffer ����
		BufferedWriter buffer = null;
		
		try {
			// ������ data1.txt�� ������ �����ϰ� ���� ����.
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			for(int i = 0; i<10;i++) {
				int num =  (int)(Math.random()*10);
				String strNum = String.valueOf(num);
				// write�� ����ϰ��� �ϴ� data�� �������̸� char�� ����Ѵ�.
				// ������ �ڵ�� �ν��ؼ� ���ڷ� ����Ѵ�.
				// ���ڸ� ����� ���̰� ����Ϸ��� ���ڿ��� �ٲپ ����ؾ� �Ѵ�.
				buffer.write(strNum);
				buffer.newLine(); // \n
			}
			// ������ write �� ���� �ݵ�� �ݾ� ����Ѵ�.
			// �׷��� ������ buffer�� �����ִ� �����Ͱ� ���� ���Ͽ� ��ϵ��� �ʴ� ��찡 �߻��Ѵ�.
			
			// ������ write �Ҷ��� close �ϱ� ���� �ؾ� �� ���� �ϳ� ���ִµ�
			buffer.flush();
			// buffer�� �����ִ� �����͸� ���Ϸ� �����ϰ� ��� �Ϸ��϶�.
			buffer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName+"���� ����");
		}
		System.out.println("�Ϸ�");

	}

}
