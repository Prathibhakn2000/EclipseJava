package com.xworkz.override;

import com.xworkz.override.like.Window;
import com.xworkz.override.like.WoodWindow;

public class WindowRunner {

	public static void main(String[] args) {
		Window window = new Window();
		window.open();
		window.close();
		window.semiClose();
		
		
		WoodWindow window1 = new WoodWindow();
		window1.open();
		window1.close();
		window1.autoClose();
		
		
		Window window2 = new WoodWindow();
		window2.close();
		window2.open();
		window2.semiClose();
		
		//data type casting ->converting parent reference type to subclass reference type, it possible in non-primitive inheritance
		WoodWindow woodWindow =(WoodWindow)window1;
		woodWindow.semiClose();
		
		WoodWindow woodWindow1 =(WoodWindow)window2;
		woodWindow1.autoClose();
		
		
		

	}

}
