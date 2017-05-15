package com.bit.oop7.inout;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {

	public static void main(String[] args) {
	
		String fileName ="src/com/bit/oop7/data1.txt";
		
		try {
			FileOutputStream fout =new FileOutputStream(fileName);
			DataOutputStream dataOut =new DataOutputStream(fout);
		
			dataOut.writeInt(20);//정수쓰기
			dataOut.writeUTF("KOREA");//문자열쓰기
			dataOut.writeChar('C');//문자쓰기
			dataOut.writeUTF("대한민국");//한글쓰기
			dataOut.writeBoolean(true);//블린쓰기
			
			dataOut.close();
			fout.close();//output은 항상닫아줘야함
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
			
		}

	}

}
