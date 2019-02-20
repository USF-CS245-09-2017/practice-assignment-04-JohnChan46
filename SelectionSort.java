public class SelectionSort implements SortingAlgorithm{

	public SelectionSort(){
	}



//@Override
	public void sort(int [] a){
		for (int i = 0; i < a.length - 1; i++){
			//find the smallesr element
			int small = i;
			for(int j = i+1; j<a.length; j++){
				if(a[j] < a[small]){
					small = j;
				}//if
			}//for
			// swap the smallest element to proper position starting from the left
			int temp = a[small];
			a[small] = a[i];
			a[i] = temp;

		}//for
	}//void
}

		







