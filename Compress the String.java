public class Solution {

	public static String compress(String inputString) {
		// Write your code here
       int n1= inputString.length();
       String ans="";
       
       ans=ans+inputString.charAt(0);
      int counter=1;
      for (int i=1 ; i<n1 ;i++){
        if (ans.charAt(ans.length()-1)==inputString.charAt(i)){
         counter++; 
        }
        else{
          if(counter>1)
          ans=ans+counter;
          ans=ans+inputString.charAt(i);
          counter=1;
          
        }       
      } if (counter>1)   
      ans=ans+counter;
      return ans;
	}

}
