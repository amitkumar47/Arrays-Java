public class solution {

	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
     int n1=input.length();
      String ans="";
      int last=0;
      ans=ans+input.charAt(0);
      for (int i=0 ; i<n1 ;i++){
        if (ans.charAt(last)==input.charAt(i)){
          continue;
        }
        else
        {
          ans=ans+input.charAt(i);
          last++;
        }
        
        
        
      }
      return ans;
      
	}
}

