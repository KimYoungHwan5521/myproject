package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName= "src/com/biz/ap/grade";
		
		FileReader fileReader;
		
		int cnt=0;
		try {
			fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			String line = new String();
			int intSum =0;
			while(true) {
				line= buffer.readLine();
				cnt++;
				if(line==null) break;
				try {
					int intNum = Integer.valueOf(line);
					intSum+= intNum;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(cnt+"��° �ٿ� ��ȿ���� ���� �� ����");
				}
			}
			System.out.println("�հ� : "+intSum);
			
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// try���� ������ �߻��ϸ� try���� ������ �κ�����(catch��) ����������.

	}

}
