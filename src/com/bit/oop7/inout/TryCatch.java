package com.bit.oop7.inout;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[] intArray = new int[10];
		 
		 for(int i =0; i<=10; i++){ 
		 try{
			
		 intArray[i] = (int)(Math.random()*10+1);
	}
		 catch(ArrayIndexOutOfBoundsException e){
			 System.out.println("배열범의가 초과 되었습니다.");
			 System.out.println("하지만 계산은 가능합니다.");
			 }
		 }
	     int intSum = 0;
	     for( int i :intArray){
		     intSum +=i;
		
	}
	     System.out.println(intSum);
	
	

}
	

}






