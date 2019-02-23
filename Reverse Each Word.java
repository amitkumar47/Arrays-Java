public class Solution {

	// Return the reversed string. No need to print
	public static String reverseEachWord(String input) {
		// Write your code here
      int n1 = input.length();
      int start=0;
      String ans="";
      for (int i=0 ; i<n1 ; i++){
        if (input.charAt(i)==' '){
          for (int j=i-1; j>=start ;j--){
            ans=ans+input.charAt(j);
          } 
          ans=ans+" ";
          start=i+1;
        }
        if(i==n1-1){
           for (int j=i; j>=start ;j--){
            ans=ans+input.charAt(j);
          } 
          ans=ans+" ";
        }
        
        
      }
return ans;
	}
}
