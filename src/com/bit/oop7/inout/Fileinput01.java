package com.bit.oop7.inout;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinput01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String fileName ="src/com/bit/oop7/inout/data.txt";
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			DataInputStream dataIn =new DataInputStream(fileIn);
			
			int ch=0;
			while((ch=dataIn.read())!= -1){//read:1바이트씩 읽음
				if(ch ==-1) break;
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 열수 없습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 읽을 수없습니다");
		}
			
			
		}
		
				
	}


