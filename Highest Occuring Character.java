// highest occurring character in the String.
public class solution {

	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
      int max=0;
      char c=' ';
     int n1= inputString.length();
      int arr[]= new int [256];
      for (int i=0 ; i<n1 ;i++){
         int k = inputString.charAt(i);
         arr[k]++;
      }
      for (int i=0 ;i<n1 ;i++){
         if (max<arr[inputString.charAt(i)]){
           max=arr[inputString.charAt(i)];
           c = inputString.charAt(i);
         }
        
      }
      return c;
	}
}
