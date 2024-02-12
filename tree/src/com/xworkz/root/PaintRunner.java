package com.xworkz.root;

import com.xworkz.root.type.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint =new Paint("red",500,3);
		paint.selectColor();
		System.out.println(paint);
		System.out.println("hashCode:"+paint.hashCode());
		
		Paint paint1 =new Paint("blue",600,5);
		System.out.println(paint1);
		System.out.println("hashCode:"+paint1.hashCode());
	}

}
