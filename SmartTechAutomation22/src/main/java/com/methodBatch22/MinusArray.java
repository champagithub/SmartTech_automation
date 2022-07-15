package com.methodBatch22;

import java.util.Arrays;

public class MinusArray {
	public static void test() {
		
		int a[]= {7,8,9,33,2,3,5}; //(distorted number/unorganized(Arrays.parallalsort.a))
		Arrays.parallelSort(a);
		int b=a.length;
		int lowest=a[0];
		
		for(int i=0;i<b;i++) {
			if(a[0]<lowest)
				lowest=a[0];
			
		}
		
		System.out.println("value of lowest="+lowest);
		
		
		
	}
public static void main(String[] args) {
	test();
}
//		int a[]= {3,5,7,9,22};
//		int b=a.length;
//		int max=a[0];
//		
//		for(int i=0;i<b;i++) {
//			 if(a[i]>max)
//				 max=a[i];
//		}
//				 
//				 
//			System.out.println("value of max="+max);	 
//		}
//		
		
		
		
		
//		int[]a= {4,5,7,8,9,10};  // (arrenge order)
//		int b=a.length;
//		int min=a[0];
//		
//		for(int i=0;i<b;i++) {
//		 if(a[0]>min) 
//		 
//			 min=a[0];
//			 
//			
//		}		 
//		System.out.println("value of minium="+min);	 
//		 
//	}
	}

	
	
	
	

