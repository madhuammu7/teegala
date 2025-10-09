package com.tnsif.array;

public class array2 {

		// TODO Auto-generated constructor stub


			public static void main(String[] args) {
				int[][] num = {{1,2,3},{4,5},{6}};
				
			//======================================
				for(int[] x : num)  //Enhanced loop / for each
				{
					for(int y : x)
					{
						System.out.print(y+" " );
					}
					System.out.println();
				}

			}

		
	}


