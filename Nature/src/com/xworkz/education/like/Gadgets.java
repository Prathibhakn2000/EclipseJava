package com.xworkz.education.like;


public class Gadgets {
	
	public void work(Object object) 
	{
	   
		
		
	if(object instanceof Camera)
		{
			Camera camera = (Camera)object;
		    System.out.println(camera.brandName);
		    camera.capturePhotos();
		}
	
	if(object instanceof SmartCamera)
	{
		SmartCamera smartcam = (SmartCamera)object;
	    System.out.println(smartcam.price);
	    smartcam.recordVideo();
	}
	
	if(object instanceof BoxCamera)
	{
		BoxCamera boxcam = (BoxCamera)object;
	    System.out.println(boxcam.speed);
	    boxcam.focusControl();
	}
	
	if(object instanceof CCTVBoxCamera)
	{
		CCTVBoxCamera cctvboxcam = (CCTVBoxCamera)object;
	    System.out.println(cctvboxcam.type);
	    cctvboxcam.record();
	}
	}

	

}