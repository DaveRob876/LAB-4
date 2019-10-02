
	public class Sorter {
	
	public int [] bubbleSort (int arr[], int arrSize) {
		int array[] = new int [5]; 
		
		int index,temp,cnt,makeSwap;
		makeSwap = 1;
		index = 0;
		
		while (index < arrSize && makeSwap == 1) {
			makeSwap = 0;
			cnt = arrSize - 1;
				while (cnt > index) {
					if(arr[cnt] < arr[cnt -1]) {
						temp = arr[cnt-1];
						arr[cnt - 1] = arr[cnt];
						arr[cnt] = temp;
						makeSwap = 1;						
					}
					cnt--;
				}
				index++;
		}
		
		return array; 
		
	}
	
	public int [] selectionSort (int arr[], int arrSize) {
		
		int index,indexsmallest,temp,cnt2;
		index = 0;
		int array[] = new int [5]; 
		
		while (index<arrSize) {
			indexsmallest = index;
			cnt2 = index + 1;
			while (cnt2 < arrSize) {
				if (arr[cnt2] < arr[indexsmallest]){
					indexsmallest = cnt2;
				}
				cnt2++;
			}
			temp = arr[index];
			arr[index] = arr[indexsmallest];
			arr[indexsmallest] = temp;
			index++;
		}
		
		return array; 
	}
	
	
		public int [] insertionSort (int arr[], int arrSize) {
		int array[] = new int [5]; 
		
		int index, key, j;
		
		for(index = 1; index < arrSize; index++) {
			key = arr[index];
			j = index - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
		return array; 

} 
		
	} 
