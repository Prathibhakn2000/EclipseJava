package com.xworkz.education;

import com.xworkz.education.like.BoxCamera;
import com.xworkz.education.like.CCTVBoxCamera;
import com.xworkz.education.like.Camera;
import com.xworkz.education.like.Gadgets;
import com.xworkz.education.like.SmartCamera;

public class CameraRunner {

	public static void main(String[] args) throws Throwable {
		
		Gadgets gadget = new Gadgets();
		Object object = new Object();
		gadget.work(object);
		
		
		System.out.println("====================================");
		
		Camera camera = new Camera();
		gadget.work(camera);
		
		
		
        System.out.println("====================================");
		
		SmartCamera smartcam = new SmartCamera();
		gadget.work(smartcam);
		
        System.out.println("====================================");
		
		BoxCamera boxcam = new BoxCamera();
		gadget.work(boxcam);
		
		System.out.println("====================================");
			
	      CCTVBoxCamera cctvboxcam = new CCTVBoxCamera();
		  gadget.work(cctvboxcam);
	}

}

