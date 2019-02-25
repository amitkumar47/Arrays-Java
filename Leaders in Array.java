/*  Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
Print all the leader elements separated by space and in the same order they are present in the input array.
*/

public class Solution {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		int n= input.length;
      for (int i=0; i<n ; i++){
        int check=0;
        for (int j=n-1 ; j>i ; j--){
           if (input[i]<input[j]){
             check=1;
             break;
           }
          
        }
        if (check==0)
          System.out.print(input[i]+" ");
      }
      
      return ;
	}
	
}

