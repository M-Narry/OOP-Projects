/**
 * Description: This program takes each of the sorting algorithms and sorts an array in descending order.
 * 
 * Input:
 * 		User input: None
 * 		Constants: None
 * 
 * Computation:
 * 		Bubble sorts array
 * 		Selection sorts array
 * 		Insertion sorts array
 * 
 * Output:
 * 		Progress of array
 * 		Sorted array with respect to each type
 * 
 * *******************************
 * 
 * @author Blake Dee
 * @contact blake.dee@my.century.edu
 * @since 11/09/2025
 * 
 * Institution: Century College
 * Course: CSCI 1081-01
 * Instructor: Mathew Nyamagwa
 */
package csci1082;

public class Driver {
	
	public static void main(String[] args) {
		
		int[]arr1 = {48, 85, 0, 12, 18, 19, 34, 5, 69, 23};
		int[]arr2 = {48, 85, 0, 12, 18, 19, 34, 5, 69, 23};
		int[]arr3 = {48, 85, 0, 12, 18, 19, 34, 5, 69, 23};
		
		introduceProgram();
		printArray(arr1);
		System.out.println("**** Bubble Sort ****");
		bubbleSortDescending(arr1);
		System.out.println();
		printArray(arr2);
		System.out.println("**** Selection Sort ****");
		selectionSortDescending(arr2);
		System.out.println();
		printArray(arr3);
		System.out.println("**** Insertion Sort ****");
		insertionSort(arr3);

	}
	
	//Bubble sort
	public static void bubbleSortDescending(int[] arr) {
		
		int n = arr.length;
		System.out.println("Sorting: ");
		for(int i = 0; i < n; i++) { //outer loop
			for (int j = 0; j < (n - i - 1); j++) { //inner loop
				// comparisons
				if(arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				printArray(arr);
			}
		}
		System.out.println("Final: ");
		printArray(arr);
	}
	
	//Selection sort
	public static void selectionSortDescending(int[] arr) {
		int n = arr.length;
		int largest; //assumed index with the largest value
		
		System.out.println("Sorting:");
		for(int i = 0; i < n; i++) { //outer loop to control the sort and unsorted part of the array
			largest = 0;
			for(int j = 1; j < (n - i); j++) { //inner loop
				if(arr[j] < arr[largest]) {
					largest = j;
				}
			} // end of inner loop
			int temp = arr[largest];
			arr[largest] = arr[n - i - 1];
			arr[n - i - 1] = temp;
			
			printArray(arr);
		}
		System.out.println("Final: ");
		printArray(arr);
		
	}
	
	//Insertion sort
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		int key;
		
		System.out.println("Sorting: ");
		for(int i = 1; i < n; i++) { //outer loop
			key = arr[i];
			int j = i - 1;
			for(j = (i - 1); j >= 0 && arr[j] < key; j--) { //inner loop
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = key;
			printArray(arr);
		}
		System.out.println("Final: ");
		printArray(arr);
	}
	
	//Print
	public static void printArray(int[] arr) {
		System.out.print("{");
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println("}");
	}
	
	public static void introduceProgram() {
		System.out.print("This program takes each sort learned in class and organizes them in descending order\n\n");
		
	}

}
