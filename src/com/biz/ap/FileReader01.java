package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "src/com/biz/ap/data";
		
		// FileReader 클래스가 생성되면서 실제 물리적 파일을 open 하는데, 어떤 이유로든 파일이름이 변경되거나, 삭제되거나
		// 누군가 open하거나 close를 하지 않았을 경우 시스템 excpetion이 발생한다.
		// 이런 경우 java는 개발자에게 이 코드분의 exception 처리를 강제하도록 한다.
		// 이 때 exception 처리를 exception handling 이라고 한다.
		try {
			
			FileReader fileReader = new FileReader(fileName);
			// fileReader에는 파일의 정보, 코드정보 등이 저장되어 있다.
			BufferedReader buffer = new BufferedReader(fileReader);
			//fileReader가 가지고 있는 정보를 BufferedReader에 연결
			// 이 때 BufferedReader는 fileReader 통로를 통해 data.txt 파일의 내용을 모두 읽어들여 문자열 형태로 보관을 한다.
			// 단, data.txt 파일이 어느크기를 넘어가면 일정한 크기단위로 잘라서 읽어 들인다.
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
			System.out.println("파일을 찾을 수 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일 읽기 중 오류 발생");
		}

	}

}
