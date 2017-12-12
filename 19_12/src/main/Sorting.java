package main;

public class Sorting {
	
	public int[] bubbleSort(int[] arr) {
		int j = 0, temp;
		while(j < arr.length - 1) {
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			j++;
		}
		
		return arr;
	}
}
