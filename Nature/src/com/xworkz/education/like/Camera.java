package com.xworkz.education.like;

public class Camera extends Object{
	
	public String brandName;
	
	public void capturePhoto()
	{
		System.out.println("running capturePhotos in Camera");
	}
	
	
		
	
	@Override	
	public Object clone()throws CloneNotSupportedException
    {
		return null;
		
    }
	@Override
	public void finalize()throws Throwable 
	{
	}

	
}

