package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/biz/ap/grade1.txt";
		
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			for(int i = 0; i<50;i++) {
				int intKor =  (int)(Math.random()*49+51);
				int intEng =  (int)(Math.random()*49+51);
				int intMath =  (int)(Math.random()*49+51);
				String strKor = String.valueOf(intKor);
				String strEng = String.valueOf(intEng);
				String strMath = String.valueOf(intMath);
				buffer.write(strKor+":"+strEng+":"+strMath);
				buffer.newLine();
			}
			
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
