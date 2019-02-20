public class SecondLargest{	
	
	public static int secondLargestElement(int[] arr) {
		/* Your class should be named SecondLargest
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
  		 */
      int max= Integer.MIN_VALUE;
      int k=Integer.MIN_VALUE;
       for (int i=0 ; i<2 ; i++){
         int j;
         for ( j=0 ;j<arr.length ; j++){
           if (arr[j]>max){
             k=max;
             max=arr[j]; 
           }  
           else if (arr[j]<max && arr[j]>k)
             k=arr[j];
         }
        
         
       }return k;

	}
}