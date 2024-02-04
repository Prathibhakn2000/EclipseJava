package com.xworkz.vegetables;

import com.xworkz.vegetables.like.Bird;

public class Parrot extends Bird{
  
  String color;
  int lifeSpan;
  
  Bird bird = new Bird();  //protected constructor in different package using new it does't allow, only using super()
  
  Parrot()
  {
	  super();
  }
  
  
}
