public class solution {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
      int n1= input.length();
      String ans="";
      
      for (int i=0; i<n1 ;i++){
        if (input.charAt(i)==c)
          continue;
        ans=ans+input.charAt(i);
        
        
        
      }
      return ans;

	}

}
