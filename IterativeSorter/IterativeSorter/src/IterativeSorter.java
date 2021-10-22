public class IterativeSorter {

	public void doBubbleSort(IntegerArray arrayToSort) {
		int n = arrayToSort.length();
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arrayToSort.read(j) > arrayToSort.read(j + 1))
				{
					int temp = arrayToSort.read(j);
					arrayToSort.write(j, arrayToSort.read(j + 1));
					arrayToSort.write(j + 1, temp);
				}
	}
	public void doSelectionSort(IntegerArray arrayToSort) {
		for (int i = 0; i < arrayToSort.length() - 1; i++)  
		{  
			int index = i;  
			for (int j = i + 1; j < arrayToSort.length(); j++){  
				if (arrayToSort.read(j) < arrayToSort.read(index)){  
					index = j; 
				}  
			}  
			int smallerNumber =  arrayToSort.read(index);
			arrayToSort.write(index, arrayToSort.read(i));
			arrayToSort.write(i, smallerNumber);
		}  
	}  
	public void doInsertionSort(IntegerArray arrayToSort) {
		int n = arrayToSort.length();  
		for (int j = 1; j < n; j++) {  
			int key = arrayToSort.read(j);  
			int i = j-1;  
			while ( (i > -1) && ( arrayToSort.read(i) > key ) ) {  
				arrayToSort.write(i + 1, i); 
				i--;  
			}  
			arrayToSort.write(i+1, key);
		}  
	}  
}

