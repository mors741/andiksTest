package com.mors741.andiksTest;

import java.util.Arrays;
import com.mors741.andiksTest.ExtLib;

public class Test {	
	public static int[] evaluate(int[] data, int p) {
		return Arrays.stream(data).parallel().map(elem -> ExtLib.eval(elem, p)).toArray();
	}
	
	public static void main(String[] args) {
		for (int x : evaluate(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)){
			System.out.print(x + ", ");
		}		
	}
}
