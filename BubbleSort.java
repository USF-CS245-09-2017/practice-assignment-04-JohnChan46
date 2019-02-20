public class BubbleSort implements SortingAlgorithm{

	public BubbleSort(){
	}



//@Override

	public void sort(int [] a){
		for (int i = 0; i < a.length - 1; i++){
			for(int j = 0; j<a.length-i-1; j++){ //find the largest element in the list
				if(a[j] > a[j+1])// "bubbling" the largest element to the end by repeating swap
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			



			}//for
		}//for
	}//void

}




