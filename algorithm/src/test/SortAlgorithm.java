package test;

public class SortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
//		select(arr);
//		quick(arr, 0, arr.length-1);
//		print(arr);
		int[] temp = new int[arr.length];
		print(arr);
		mergeSort(arr, temp, 0, arr.length-1);
		print(arr);
		
	}
	
	static void print(int[] arr) {
		for(int a : arr) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}
	
	static void bubble(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		print(arr);
	}
	
	static void insert(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(arr[j] >= key) {
				arr[j+1] = arr[j];
				j--;
				if(j < 0) break;
			}
			arr[j+1] = key;
		}
		print(arr);
	}
	
	static void select(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int index = i;
			for(int j = i; j < arr.length-1; j++) {
				if(arr[j+1] < min) {
					min = arr[j+1];
					index = j+1;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		print(arr);
	}
	
	static void quick(int[] arr, int start, int end) {
		System.out.println("quick " + start + " " + end);
		int part = partition(arr, start, end);
		if(part - 1 > start) quick(arr, start, part-1);
		if(end > part) quick(arr, part, end);		
	}
	
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start+end) / 2];
		while(start <= end) {
			while(arr[start] < pivot) start++;
			while(arr[end] > pivot) end--;
			if(start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		return start;
	}

	
//	static void mergeSort(int[] arr, int[] temp, int start, int end) {
//		if(start < end) {
//			int mid = (start + end) / 2;
//			mergeSort(arr, temp, start, mid);
//			mergeSort(arr, temp, mid+1, end);
//			merge(arr, temp, start, mid, end);
//		}
//	}
//	
//	static void merge(int[] arr, int[] temp, int start, int mid, int end) {
//		for(int i = start; i <= end; i++) {
//			temp[i] = arr[i];
//		}
//		int part1 = start;
//		int part2 = mid+1;
//		int index = start;
//		while(part1 <= mid && part2 <= end) {
//			if(temp[part1] < temp[part2]) {
//				arr[index] = temp[part1];
//				part1++;
//			}
//			else {
//				arr[index] = temp[part2];
//				part2++;
//			}
//			index++;
//		}
//		for(int i = part1; i <= mid; i++) {
//			arr[index] = temp[i];
//			index++;
//		}
//	}

	static void mergeSort(int[] arr, int[] temp, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid+1, end);
			merge(arr, temp, start, mid, end);
		}
	}
	
	static void merge(int[] arr, int[] temp, int start, int mid, int end) {
		for(int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid+1;
		int index = start;
		while(part1 <= mid && part2 <= end) {
			if(temp[part1] < temp[part2]) {
				arr[index] = temp[part1];
				part1++;
			}
			else {
				arr[index] = temp[part2];
				part2++;
			}
			index++;
		}
		for(int i = part1; i <= mid; i++) {
			arr[index] = temp[i];
			index++;
		}
	}
	
	
}
