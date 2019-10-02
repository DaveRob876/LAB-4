
public class Seacher {

	public int linearSearcher (int arr[], int arrSize, int searchVal) {
		
		int index = 0; 
		
		while ( index < arrSize) {
			if (arr[index] == searchVal ) {
				
				return index; 
				
			}
				
				
			
			 index++; 
		}
		
		
		
		return -1; 
	}
	
	public int binarySearch(int arr[], int arrSize, int searchVal) {
		Sorter sorterobj = new Sorter();
		sorterobj.bubbleSort(arr, arrSize);
		
		int start,end,mid;
		start = 0;
		end = arrSize - 1;
		
		while (start <= end){
			mid = (start + end) / 2;
			if (searchVal == arr[mid]) {
				return mid;
			}
			if (searchVal < arr[mid]) {
				end = mid - 1;
			}
			if (searchVal > arr[mid]) {
				start = mid + 1;
			}
		}
		
		return -1;
	}
	
	
	
}
