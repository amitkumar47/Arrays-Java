public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
      String reverse="";
      int n=input.length();
      int start=0;
      int last=n;
      for (int i=n-1; i>=0 ; i--){
        if (input.charAt(i)==' '){
          start=i+1;
          
          reverse=reverse+input.substring(start,last)+" ";
            last=i;
        }
        
      }
      reverse = reverse + input.substring(0,start);
      return reverse;
	}
}