import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
         int m=0;
         int n=0;
      Scanner scan = new Scanner (System.in);
      m=scan.nextInt();
      n=scan.nextInt();
      int arr [][] = new int [m][n];
      
      for (int i=0; i <m ;i++){
              int sum=0;
        for (int j=0 ; j<n ; j++){
          arr[i][j]=scan.nextInt();
          sum=sum+arr[i][j];
        }
        System.out.print(sum+" ");
      }
      
	}
}