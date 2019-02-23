public class solution {

	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
    boolean check=true;
      int n1=input1.length();
      int n2=input2.length();
      if (n1!=n2){
        check=false;
        return check;
      }

      
      int arr[]= new int [256];
      for (int i=0 ; i<n1 ; i++){
        int k = input1.charAt(i);
        arr[k]++;
      }
       for (int i=0 ; i<n2 ; i++){
        int k = input2.charAt(i);
        arr[k]--;
      }
      
      for (int i=0 ; i<256  ; i++){
        if (arr[i]!=0)
          check=false;
      }
      
      return check;
	}
}