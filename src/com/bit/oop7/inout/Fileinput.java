package com.bit.oop7.inout;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinput {

	public static void main(String[] args) {
		
		String fileName ="src/com/bit/oop7/inout/data.txt";
		FileInputStream fileIn=null;
		DataInputStream dataIn=null;
		try {//사용자에게문제를알려주고중단시기지 않고 진행하기 위해 try catch
			//파일을 읽기위해 open할때 예외가 발생하면
			fileIn = new FileInputStream(fileName);//파일읽어서
			dataIn = new DataInputStream(fileIn);//코드로변환 파이프연결
		}catch(FileNotFoundException e){
			System.out.println("파일이 없습니다");
			int ch= 0;
			
			try {
				while((ch = dataIn.read()) != -1){//파이프로 읽어들어는것
					if(ch == -1) break;
					System.out.println((char)ch);
					
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
//				e1.printStackTrace();
				System.out.println("읽기 예외가 발생했습니다");
			}		
			
			//파일 열기오류(파일이 없어졌을때 발생)
//		} catch (FileNotFoundException e) {//파일이없음을 처리해라
			// TODO Auto-generated catch block
			//파일 열기 오류 발생 처리
//			e.printStackTrace();
			
			
//		} catch (IOException e) {
			// TODO Auto-generated catch block
		
//			e.printStackTrace();
		}
		
	}

}
