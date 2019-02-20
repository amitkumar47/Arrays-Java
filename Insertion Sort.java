public class InsertionSort {	
	//arr is the input array you have to sort
	public static void insertionSort(int[] arr){
		//write your code here
      	  int i,j,temp;
			for ( i=1 ; i<arr.length ; i++) {
				
				 temp = arr[i];
				for ( j=i-1 ; j>=0 && arr[j]>temp ; j--) {
						arr[j+1]=arr[j];
				}
				
				arr[j+1]=temp;
				
			
				
			}
		
	}
}