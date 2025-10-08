package com.tnsif.task7;

public class jaggedarray {
	    public static void main(String[] args) {
	        // Define a jagged array statically
	        int[][] jaggedArray = {
	            {1, 2, 3, 4},
	            {2, 3, 5},
	            {3, 4, 6, 7}
	        };

	        // Find intersection of all rows
	        System.out.print("Common elements: ");
	        for (int i = 0; i < jaggedArray[0].length; i++) {
	            int candidate = jaggedArray[0][i];
	            boolean isCommon = true;

	            // Check if candidate exists in all other rows
	            for (int j = 1; j < jaggedArray.length; j++) {
	                boolean found = false;
	                for (int k = 0; k < jaggedArray[j].length; k++) {
	                    if (jaggedArray[j][k] == candidate) {
	                        found = true;
	                        break;
	                    }
	                }
	                if (!found) {
	                    isCommon = false;
	                    break;
	                }
	            }

	            if (isCommon) {
	                System.out.print(candidate + " ");
	            }
	        }
	    }
	}



