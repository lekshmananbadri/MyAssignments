package week1.day2;

import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
		int arr[]= {3,2,11,4,6,7};
		int array[] = {1,2,8,4,9,7};
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < array.length; j++) {
			if(arr[i]==array[j]) {
				System.out.println(arr[i]);
			}
			
		}
			
		}

	}

}
