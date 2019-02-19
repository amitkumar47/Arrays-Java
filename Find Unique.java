/*   Given an integer array of size 2N + 1. In this given array, N numbers are present twice and one number is present only once in the array.
You need to find and return that number which is unique in the array.
*/

public class Solution{	
	
	public static int findUnique(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
      int i;
	for ( i=0 ;  i <(arr.length)  ; i++){
	           int check=0;
	           int j;
	           for ( j=0 ; j< arr.length ; j++ ){
	        	    if (i==j) {
	        	    	continue;
	        	    	}
	                if (arr[i]==arr[j]) {
	                check=1; 
	                break;
	                }
	           }
	          if (check==0){
	            break;
                            }
              
    }
      return arr[i];
      
   
        
    }
}