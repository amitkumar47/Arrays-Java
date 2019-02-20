public class ArrayRotate {	

	public static void rotate(int[] arr, int d) {
		/* Your class should be named ArrayRotate
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to print or return the output.
      		 * Taking input and printing the output is handled automatically.
     		 */
       for (int i = 0 ; i<d ; i++){
         int temp =arr[0];
         for (int j=0 ; j<arr.length-1 ;j++){
           arr[j]=arr[j+1];            
         }
         
        arr[arr.length-1]=temp;
       }

	}
}