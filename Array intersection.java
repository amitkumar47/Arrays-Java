/*  Given two random integer arrays of size m and n, print their intersection. That is, print all the elements that are present in both the given arrays.
Input arrays can contain duplicate elements.
Note : Order of elements are not important
Input format :
Line 1 : Array 1 Size
Line 2 : Array 1 elements (separated by space)
Line 3 : Array 2 Size
Line 4 : Array 2 elements (separated by space)

*/

public class Solution{	
	
	public static void intersections(int[] input1, int[] input2){
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */  int i;
	for ( i=0 ;  i <(input1.length)  ; i++){
	           int check=0;
	           int j;
	           for ( j=0 ; j< input2.length ; j++ ){
	        	   
	                if (input1[i]==input2[j]) {
	                check=1; 
                    input2[j] = -1000000;  
	                break;
	                }
	           }
	          if (check==1){
	            System.out.println(input1[i]);
                            }
              
    }
     
      
   
		
	}
}