/* Given a number n, put all elements from 1 to n in an array in order - 1,3,.......4,2.
Input Format :
 Integer n
*/


public class Solution {

	
	public static int[] arrange(int n){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/		
         
		
		int arr[]= new int[n];
		int gap=1;
		
		for (int i=0; i<n/2  ;i++) {
			arr[i]=gap;
			arr[n-i-1]=gap+1;
			gap=gap+2;
		}
		if (n%2!=0) {
			arr[n/2]=n;
		}
      return arr;
	}
	
}
