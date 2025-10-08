package com.tnsif.exceptions;

public class nestedtry {


		// TODO Auto-generated constructor stub
	

			public static void main(String[] args) {
				try {
					//============================
					try {
						int x = 20/0;
					}catch(ArithmeticException e)
					{
					System.out.println("This is 1st try");
					}
					//==============================
					
					
				}
				catch(Exception e)
				{
					System.out.println("This is outer catch");
				}
			}
		
	}


