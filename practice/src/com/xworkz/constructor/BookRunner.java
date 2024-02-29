package com.xworkz.constructor;

public class BookRunner {

	public static void main(String[] args) {
//		Book1 temp=new Book1("English",100);
//		System.out.println(temp.name + ":"+temp.price);
//		
		Book2 ref=new Book2("Hindi",200,"xxx");
		System.out.println("Name:"+ref.name+"\t"+"Price:"+ref.price+"\t"+"Brand:"+ref.brand);
				
		
	}

}
