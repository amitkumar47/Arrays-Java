/* Given an array of length N, swap every pair of alternate elements in the array.
You don't need to print or return anything, just change in the input array itself.
*/


public class Solution {

	
	public static void swapAlternate(int[] input){
		
		/* Your class should be named Solution.
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
		* Taking input and printing output is handled automatically.
		*/	
       int k;
      int check=0;
      if ((input.length%2)!=0){
        check=1;
      }
      for (int i=0 ; i<(input.length-check)  ;i+=2){
        k = input[i];
        input[i]=input[i+1];
        input[i+1]=k;
     
      }
      return;
	}
	
}
