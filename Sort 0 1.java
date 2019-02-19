/*  You are given an integer array A that contains only integers 0 and 1. Write a function to sort this array. Find a solution which scans the array only once. Don't use extra array.
You need to change in the given array itself. So no need to return or print anything.
*/

public class SortBinaryArray{	

	public static void sortBinaryArray(int[] arr){
		/* Your class should be named SortBinaryArray.
		 * Don't write main().
     		 * Don't read input, it is passed as function argument.
     		 * Update in the given array itself. Don't return or print anything.
     		 * Taking input and printing output is handled automatically.
                 */
      int l=0;
      int r=(arr.length-1);

      for (int i=0; l<r ; i++){
        if (arr[l]==0)
          l++;
       else  if (arr[r]==1)
          r--;
        else if (arr[l]>arr[r]){
          int k= arr[l];
          arr[l]=arr[r];
          arr[r]=k;
          l++;
          r--;
        }
        
        
      }
      
      
      
      
	}
}