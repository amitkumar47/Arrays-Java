
public class Solution {

	public static boolean checkPalindrome(String str){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/int n=str.length();
          boolean is=true;
         for (int i=0; (n-2*i)>1 ;i++){
           if ((str.charAt(i)) != str.charAt(n-1-i)){
             is=false;
             break;}     
              }
      return is;


	}
}
