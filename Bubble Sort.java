public class BubbleSort {	
	//arr is the input array you have to sort
	public static void bubbleSort(int[] arr){
		//write your code here
      
      for (int i=0 ; i<arr.length-1 ;i++) {				
				for (int j=0 ; j<arr.length-1-i ;j++) {
					if (arr[j]>arr[j+1]) {
						int temp= arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
						
					
				}
			}
			
	}
}