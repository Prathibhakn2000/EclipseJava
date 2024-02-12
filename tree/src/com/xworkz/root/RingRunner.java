package com.xworkz.root;

import com.xworkz.root.type.Ring;

public class RingRunner {

	public static void main(String[] args) {
		Ring ring = new Ring();
		ring.design();
        ring.type= "gold";
        ring.price= 5000;
        ring.weight= 1.5f;
        System.out.println(ring);
        System.out.println("hashCode:"+ring.hashCode());
        ring.type= "silver";
        ring.price= 2000;
        ring.weight= 1.4f;
        System.out.println(ring);// implicit invoke toString() and ref
        System.out.println("hashCode:"+ring.hashCode());//explicit invoke hashCode() ->hascode is same for same ref and different ref diffrent nbr
	}

}
