/* Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
*/
public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here

      
      int n= input.length;
      int m= input[0].length;
       
      for (int i=0; i <n ; i++){
        for (int k=0 ; k<n-i ; k++){
          for (int j=0 ; j<m ; j++){
            System.out.print(input[i][j]+" ");
          }
          System.out.println();
        }
        
        
      }
      
	}
}