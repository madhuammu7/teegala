package com.tnsif.task6;


 public class square extends Shape{

	private int side=2;

	public square(int side)

	{

	

	this.side=side;
	}


	void calArea()

	{

	super.area=side*side;
}
}