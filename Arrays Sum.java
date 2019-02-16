/* Given an array/list of length N, you need to find and return the sum of all elements of the array/list.
Input Format :
Line 1 : An Integer N i.e. size of array/list
Line 2 : N integers which are elements of the array/list, separated by spaces
*/


public class Solution {

	public static int sum(int[] input){
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/	
      int sum=0;
		for (int i=0 ;i < input.length ;i++){
          sum= sum +input[i];
        }
      return sum;

	}
	
}