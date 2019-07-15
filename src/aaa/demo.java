package aaa;

import java.util.Arrays;

public class demo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int [] arr = {1,2,3};
		String str = "[";
		StringBuilder append = sb.append(str);
		for(int i =0;i<arr.length;i++) {
			append.append(arr[i]+",");
			
		}
		append.substring(","+1);
		System.out.println();
		/*
		 * String string = Arrays.toString(arr); System.out.println(string);
		 */
	}
		
		
		
	
}
