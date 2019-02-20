public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
		/* Your class should be named CheckRotation
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
      int check=0;
      for (int i=0 ; i<arr.length ; i++){
        if (arr[i]>arr[i+1]){
          check=i+1;
          break;}
      }
      return check;

	}
}