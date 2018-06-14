package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "src/com/biz/ap/data";
		
		// FileReader Ŭ������ �����Ǹ鼭 ���� ������ ������ open �ϴµ�, � �����ε� �����̸��� ����ǰų�, �����ǰų�
		// ������ open�ϰų� close�� ���� �ʾ��� ��� �ý��� excpetion�� �߻��Ѵ�.
		// �̷� ��� java�� �����ڿ��� �� �ڵ���� exception ó���� �����ϵ��� �Ѵ�.
		// �� �� exception ó���� exception handling �̶�� �Ѵ�.
		try {
			
			FileReader fileReader = new FileReader(fileName);
			// fileReader���� ������ ����, �ڵ����� ���� ����Ǿ� �ִ�.
			BufferedReader buffer = new BufferedReader(fileReader);
			//fileReader�� ������ �ִ� ������ BufferedReader�� ����
			// �� �� BufferedReader�� fileReader ��θ� ���� data.txt ������ ������ ��� �о�鿩 ���ڿ� ���·� ������ �Ѵ�.
			// ��, data.txt ������ ���ũ�⸦ �Ѿ�� ������ ũ������� �߶� �о� ���δ�.
			String line = new String();
			
			while(true) {
				line=buffer.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("������ ã�� �� ����");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("���� �б� �� ���� �߻�");
		}

	}

}
