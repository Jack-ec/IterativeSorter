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
	}

	public void doInsertionSort(IntegerArray arrayToSort) {
	}

}
