package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String fileName = "src/com/biz/ap/grade2.txt";
		
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		
		try {
			// true ���� �־��ָ� ������ �ִ� ���Ͽ� �߰��ϴ� ������� ������ �ۼ��Ѵ�.
			fileWriter = new FileWriter(fileName, true);
			buffer = new BufferedWriter(fileWriter);
			
			while(true) {
				try {
					System.out.print("����:");
					String line = scanner.nextLine();
					if(line.equals("~END")) break;
					int g=Integer.valueOf(line);
					if(g<0||g>100) {
						System.out.println("���� ���� �ʰ�");
						continue;
					}
					String strKor = line;
					
					System.out.print("����:");
					line = scanner.nextLine();
					if(line.equals("~END")) break;
					g=Integer.valueOf(line);
					if(g<0||g>100) {
						System.out.println("���� ���� �ʰ�");
						continue;
					}
					String strEng = line;
					
					System.out.print("����:");
					line = scanner.nextLine();
					if(line.equals("~END")) break;
					g=Integer.valueOf(line);
					if(g<0||g>100) {
						System.out.println("���� ���� �ʰ�");
						continue;
					}
					String strMath = line;
					
					buffer.write(strKor+":"+strEng+":"+strMath);
					buffer.newLine();
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("������ �ƴ� ���� �ԷµǾ����ϴ�.");
				}
			}
			
			scanner.close();
			buffer.flush();
			buffer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName+"���� ����");
		}
		System.out.println("����ǥ �ۼ� �Ϸ�");
	}

}
