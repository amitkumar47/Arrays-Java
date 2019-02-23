
public class Solution {

	
	public static void findLargest(int input[][]){
		
		/* Your class should be named Solution.
		* Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
      int n=input.length;
      int m= input[0].length;
      int largest=Integer.MIN_VALUE;
      
      String what= "row";
      int k=0;
      
      for (int i=0 ; i<n ;i++){
        int sum=0;
        for (int j=0 ; j<m ; j++){
          sum=sum+input[i][j];
        }
        if (sum>largest){
          largest=sum;
          k=i;
        }}
        for (int i=0 ; i<m ;i++){
          int sum=0;
        for (int j=0 ; j<n ; j++){
          sum=sum+input[j][i];
        }
        if (sum>largest){
          largest=sum;
          k=i;
          what="column";
        }}
          System.out.print(what+" "+k+" "+largest);
      
      
      


	

    }
}
