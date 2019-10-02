
import java.util.Scanner;
public class DRIVERR {
 
 
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
 
		//prompt
		//System.out.print("Please enter 5 numbers:  ");
		//int num = Integer.parseInt(scan.nextLine());
 
		//Create a string array to store the numbers 
		int array[] = new int [5];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter Number " + (i+1) + " : ");
		        array[i] = scan.nextInt();
		}
		    
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(" Amount " + (i+1) + " : ");
		        System.out.print(array[i] + "\n");
		}
		  
 
		   //prompt 
		System.out.println(" Enter the type of operation you would like");
		System.out.println(" 1. ------------- Linear Search");
		System.out.println(" 2. ------------- Binary Search");
		System.out.println(" 3. ------------- Bubble Sort");
		System.out.println(" 4. ------------- Selection Sort");
		System.out.println(" 5. ------------- Insertion Sort");
		System.out.println(" 6. ------------- Display big O");
		int input; 
		
		input = scan.nextInt();
		
		//linear
				if(input == 1 ) {
					
					System.out.println("What value would you like to search for?");
					int searchval = scan.nextInt();
					Seacher Seacherobj = new Seacher();
					
					
					int val = Seacherobj.linearSearcher(array, array.length, searchval);
					
					System.out.println("Number was found in array at position :" + val);
					
				}
					
		//binary
					if(input == 2 ) {
					
					System.out.println("What value would you like to search for?");
					int searchval = scan.nextInt();
					Seacher Seacherobj = new Seacher();
					
					
					int val = Seacherobj.binarySearch(array, array.length, searchval);
					
					System.out.println("Number was found in array at position :" + val);
					
				}
					
		//
				//BUBBLE
					if(input == 3) {
						
						Sorter sorterobj = new Sorter();
						int [] sortedarr = sorterobj.bubbleSort(array, array.length);
						int i;
						
					/*	for(i=0;i<array.length;i++) {
							System.out.println(sortedarr[i]);
						}
						*/
						
						for(i=0;i<5;i++) {
							System.out.println(array[i]);
						}
					}
	
		
					//SELECTION
					if(input == 4) {
						
						Sorter sorterobj = new Sorter();
						int [] sortedarr = sorterobj.selectionSort(array, array.length); 
						int i;
						
					/*	for(i=0;i<array.length;i++) {
							System.out.println(sortedarr[i]);
						}
						*/
						
						for(i=0;i<5;i++) {
							System.out.println(array[i]);
						}
					}
					
					//INSERTION
					if(input == 5) {
						
						Sorter sorterobj = new Sorter();
						int [] sortedarr = sorterobj.insertionSort(array, array.length); 
						int i;
						
					/*	for(i=0;i<array.length;i++) {
							System.out.println(sortedarr[i]);
						}
						*/
						
						for(i=0;i<5;i++) {
							System.out.println(array[i]);
						}
					}
					
					if( input == 6) {
						System.out.println(" Big O is 40 constant time ");
					}
 
	}
 
}