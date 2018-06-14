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
			// true 값을 넣어주면 기존에 있던 파일에 추가하는 방식으로 파일을 작성한다.
			fileWriter = new FileWriter(fileName, true);
			buffer = new BufferedWriter(fileWriter);
			
			while(true) {
				try {
					System.out.print("국어:");
					String line = scanner.nextLine();
					if(line.equals("~END")) break;
					int g=Integer.valueOf(line);
					if(g<0||g>100) {
						System.out.println("점수 범위 초과");
						continue;
					}
					String strKor = line;
					
					System.out.print("영어:");
					line = scanner.nextLine();
					if(line.equals("~END")) break;
					g=Integer.valueOf(line);
					if(g<0||g>100) {
						System.out.println("점수 범위 초과");
						continue;
					}
					String strEng = line;
					
					System.out.print("수학:");
					line = scanner.nextLine();
					if(line.equals("~END")) break;
					g=Integer.valueOf(line);
					if(g<0||g>100) {
						System.out.println("점수 범위 초과");
						continue;
					}
					String strMath = line;
					
					buffer.write(strKor+":"+strEng+":"+strMath);
					buffer.newLine();
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("정수가 아닌 값이 입력되었습니다.");
				}
			}
			
			scanner.close();
			buffer.flush();
			buffer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName+"생성 오류");
		}
		System.out.println("성적표 작성 완료");
	}

}
