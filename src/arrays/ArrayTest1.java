package arrays;

import java.util.Arrays;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] n = {100, 200, 300};
		int len = n.length;
		
		for (int i = 0; i < len ; i++) {
			System.out.println(n[i]);			
		}
		
		System.out.println("--------------------");
		System.out.println(Arrays.toString(n));
	}
}
