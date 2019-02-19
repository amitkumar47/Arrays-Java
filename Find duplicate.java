/*  Given an array of integers of size n which contains numbers from 0 to n - 2. Each number is present at least once. That is, if n = 5, numbers from 0 to 3 is present in the given array at least once and one number is present twice. You need to find and return that duplicate number present in the array.
Assume, duplicate number is always present in the array
*/

public class Solution{	
	
	public static int duplicate(int[] arr){
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
	          if (check==1){
	            break;
                            }
              
    }
      return arr[i];
      
   
	}
}