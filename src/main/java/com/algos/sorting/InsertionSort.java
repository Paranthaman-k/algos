package com.algos.sorting;


public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	private static void sort(int [] arr ) {
		
		for (int i = 1;  i < arr.length; i++) {
			int insertElement = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > insertElement)
			{
					arr[j + 1] = arr[j];
					j--;
			}
			
			arr[j + 1] = insertElement;
			for (int k = 0; k < arr.length; k++) {
				System.out.println("i-"+i+", j-"+j+", arr-"+arr[k]);
			}
		}
	}

}
