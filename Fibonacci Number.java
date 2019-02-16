/* Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
*/


public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
         int precheck =0;
         int check =1;
         boolean ans;
       for (int i=0 ; n>=check ; i++){
          int k= check;
          check=precheck+check;
          precheck = k;
         if (check==n){
           ans = true;
           return ans;}
             
       }
         
    
       ans =false;
      return ans;
      
	}
	

}
